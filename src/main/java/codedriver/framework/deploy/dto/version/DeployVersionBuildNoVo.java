package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.deploy.constvalue.BuildNoStatus;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.TimeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

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
        return TimeUtil.getTimeRangeList(this.startTimeRange);
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