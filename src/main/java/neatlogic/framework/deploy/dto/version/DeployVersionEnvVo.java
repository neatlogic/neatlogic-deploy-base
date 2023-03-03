package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.constvalue.VersionEnvStatus;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @author longrf
 * @date 2022/7/8 11:12 上午
 */
public class DeployVersionEnvVo extends BaseEditorVo {

    private static final long serialVersionUID = -5292013432947748975L;

    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "环境名称", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "作业id", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "状态", type = ApiParamType.STRING)
    private String status = "pending";
    @EntityField(name = "状态名称", type = ApiParamType.STRING)
    private String statusName;
    @EntityField(name = "runnerMapId", type = ApiParamType.LONG)
    private Long runnerMapId;
    @EntityField(name = "runnerGroup", type = ApiParamType.JSONOBJECT)
    private JSONObject runnerGroup;
    @EntityField(name = "buildNo", type = ApiParamType.INTEGER)
    private Integer buildNo;
    @EntityField(name = "是否镜像发布", type = ApiParamType.INTEGER)
    private Integer isMirror;
    @JSONField(serialize = false)
    private String runnerGroupStr;

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
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
            return VersionEnvStatus.getText(status);
        }
        return statusName;
    }

    public Long getRunnerMapId() {
        return runnerMapId;
    }

    public void setRunnerMapId(Long runnerMapId) {
        this.runnerMapId = runnerMapId;
    }

    public JSONObject getRunnerGroup() {
        if (runnerGroup == null && org.apache.commons.lang3.StringUtils.isNotBlank(runnerGroupStr)) {
            runnerGroup = JSONObject.parseObject(runnerGroupStr);
        }
        return runnerGroup;
    }

    public void setRunnerGroup(JSONObject runnerGroup) {
        this.runnerGroup = runnerGroup;
    }

    public String getRunnerGroupStr() {
        if (org.apache.commons.lang3.StringUtils.isBlank(runnerGroupStr) && MapUtils.isNotEmpty(runnerGroup)) {
            runnerGroupStr = JSONObject.toJSONString(runnerGroup);
        }
        return runnerGroupStr;
    }

    public void setRunnerGroupStr(String runnerGroupStr) {
        this.runnerGroupStr = runnerGroupStr;
    }

    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public Integer getIsMirror() {
        return isMirror;
    }

    public void setIsMirror(Integer isMirror) {
        this.isMirror = isMirror;
    }
}
