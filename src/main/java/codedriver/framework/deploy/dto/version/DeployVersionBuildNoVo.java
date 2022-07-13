package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.deploy.constvalue.BuildNoStatus;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author longrf
 * @date 2022/7/8 11:12 上午
 */
public class DeployVersionBuildNoVo extends BaseEditorVo {

    private static final long serialVersionUID = -1948071236425118588L;

    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "版本", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "版本是否封版", type = ApiParamType.INTEGER)
    private Integer versionIsLocked;
    @EntityField(name = "编译号", type = ApiParamType.INTEGER)
    private Integer buildNo;
    @EntityField(name = "作业id", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "编译状态", type = ApiParamType.STRING)
    private String status;
    @EntityField(name = "编译状态名称", type = ApiParamType.STRING)
    private String statusName;
    @EntityField(name = "额外信息", type = ApiParamType.JSONOBJECT)
    private JSONObject data;
    @JSONField(serialize = false)
    private String dataStr;
    @JSONField(serialize = false)
    private JSONObject startTimeRange;
    @EntityField(name = "编译开始时间", type = ApiParamType.STRING)
    private Date compileStartTime;
    @EntityField(name = "编译结束时间", type = ApiParamType.STRING)
    private Date compileEndTime;

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getVersionIsLocked() {
        return versionIsLocked;
    }

    public void setVersionIsLocked(Integer versionIsLocked) {
        this.versionIsLocked = versionIsLocked;
    }

    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        if (StringUtils.isBlank(statusName) && StringUtils.isNotBlank(status)) {
            return BuildNoStatus.getText(status);
        }
        return statusName;
    }

    public JSONObject getData() {
        if (MapUtils.isEmpty(data) && StringUtils.isNotBlank(dataStr)) {
            data = JSONObject.parseObject(dataStr);
        }
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public String getDataStr() {
        if (StringUtils.isEmpty(dataStr) && MapUtils.isNotEmpty(data)) {
            dataStr = data.toJSONString();
        }
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    public List<Long> getStartTimeRange() {
        long startTime = 0L;
        long endTime = 0L;
        if (MapUtils.isNotEmpty(this.startTimeRange)) {
            String unit = this.startTimeRange.getString("timeUnit");
            String timeRange = this.startTimeRange.getString("timeRange");
            long st = this.startTimeRange.getLongValue("startTime");
            long et = this.startTimeRange.getLongValue("endTime");
            if (StringUtils.isNotBlank(unit) && StringUtils.isNotBlank(timeRange)) {
                endTime = System.currentTimeMillis() / 1000;
                int tr = Integer.parseInt(timeRange);
                Calendar now = Calendar.getInstance();
                switch (unit) {
                    case "day":
                        now.add(Calendar.DAY_OF_YEAR, -tr);
                        break;
                    case "week":
                        now.add(Calendar.WEEK_OF_YEAR, -tr);
                        break;
                    case "month":
                        now.add(Calendar.MONTH, -tr);
                        break;
                    case "year":
                        now.add(Calendar.YEAR, -tr);
                        break;
                }
                startTime = now.getTimeInMillis() / 1000;
            } else if (st > 0 && et > 0) {
                startTime = st / 1000;
                endTime = et / 1000;
            }
        }
        List<Long> startTimeRange = new ArrayList<>();
        if (startTime > 0 && endTime > 0 && startTime <= endTime) {
            startTimeRange.add(startTime);
            startTimeRange.add(endTime);
        }
        return startTimeRange;
    }

    public void setStartTimeRange(JSONObject startTimeRange) {
        this.startTimeRange = startTimeRange;
    }

    public Date getCompileStartTime() {
        return compileStartTime;
    }

    public void setCompileStartTime(Date compileStartTime) {
        this.compileStartTime = compileStartTime;
    }

    public Date getCompileEndTime() {
        return compileEndTime;
    }

    public void setCompileEndTime(Date compileEndTime) {
        this.compileEndTime = compileEndTime;
    }
}
