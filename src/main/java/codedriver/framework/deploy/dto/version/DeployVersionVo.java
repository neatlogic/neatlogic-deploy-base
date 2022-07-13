package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author longrf
 * @date 2022/5/26 4:37 下午
 */
public class DeployVersionVo extends BaseEditorVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "版本", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用系统名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "应用模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "应用模块名称", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "是否封版", type = ApiParamType.INTEGER)
    private Integer isLocked;
    @EntityField(name = "配置信息", type = ApiParamType.JSONOBJECT)
    private JSONObject config;
    @EntityField(name = "应用系统id列表", type = ApiParamType.JSONARRAY)
    private List<Long> appSystemIdList;
    @EntityField(name = "应用模块id列表", type = ApiParamType.JSONARRAY)
    private List<Long> appModuleIdList;
    @EntityField(name = "环境列表", type = ApiParamType.JSONARRAY)
    private List<DeployVersionEnvVo> envList;
    @EntityField(name = "编译号列表", type = ApiParamType.JSONARRAY)
    private List<DeployVersionBuildNoVo> buildNoList;
    @JSONField(serialize = false)
    private JSONObject startTimeRange;

    @JSONField(serialize = false)
    private String configStr;

    public DeployVersionVo() {
    }

    public DeployVersionVo(String version, Long appSystemId, Long appModuleId) {
        this.version = version;
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
    }

    public DeployVersionVo(Long id, JSONObject config) {
        this.id = id;
        this.config = config;
    }

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public String getAppModuleName() {
        return appModuleName;
    }

    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName;
    }

    public Integer getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Integer isLocked) {
        this.isLocked = isLocked;
    }


    public List<Long> getAppSystemIdList() {
        return appSystemIdList;
    }

    public void setAppSystemIdList(List<Long> appSystemIdList) {
        this.appSystemIdList = appSystemIdList;
    }

    public List<Long> getAppModuleIdList() {
        return appModuleIdList;
    }

    public void setAppModuleIdList(List<Long> appModuleIdList) {
        this.appModuleIdList = appModuleIdList;
    }

    public List<DeployVersionEnvVo> getEnvList() {
        return envList;
    }

    public void setEnvList(List<DeployVersionEnvVo> envList) {
        this.envList = envList;
    }

    public List<DeployVersionBuildNoVo> getBuildNoList() {
        return buildNoList;
    }

    public void setBuildNoList(List<DeployVersionBuildNoVo> buildNoList) {
        this.buildNoList = buildNoList;
    }

    public JSONObject getConfig() {
        return config;
    }

    public void setConfig(String configStr) {
        if (StringUtils.isNotBlank(configStr)) {
            this.config = JSONObject.parseObject(configStr);
        } else {
            this.config = null;
        }
    }

    public String getConfigStr() {
        if (config != null) {
            return config.toJSONString();
        }
        return null;
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
}
