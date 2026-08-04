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

    @EntityField(name = "nfddv.deployversionenvvo.versionid.name", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "nfddv.deployversionenvvo.envid.name", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "nfddv.deployversionenvvo.envname.name", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "nfddv.deployversionenvvo.jobid.name", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "nfddv.deployversionenvvo.status.name", type = ApiParamType.STRING)
    private String status = "pending";
    @EntityField(name = "nfddv.deployversionenvvo.statusname.name", type = ApiParamType.STRING)
    private String statusName;
    @EntityField(name = "nfddv.deployversionenvvo.runnermapid.name", type = ApiParamType.LONG)
    private Long runnerMapId;
    @EntityField(name = "nfddv.deployversionenvvo.runnergroup.name", type = ApiParamType.JSONOBJECT)
    private JSONObject runnerGroup;
    @EntityField(name = "nfddv.deployversionenvvo.buildno.name", type = ApiParamType.INTEGER)
    private Integer buildNo;
    @EntityField(name = "nfddv.deployversionenvvo.ismirror.name", type = ApiParamType.INTEGER)
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
