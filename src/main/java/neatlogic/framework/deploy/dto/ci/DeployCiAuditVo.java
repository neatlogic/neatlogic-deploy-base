package neatlogic.framework.deploy.dto.ci;

import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.common.audit.AuditVoHandler;
import neatlogic.framework.common.config.Config;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.constvalue.DeployCiActionType;
import neatlogic.framework.deploy.constvalue.DeployCiAuditStatus;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

public class DeployCiAuditVo extends BaseEditorVo implements AuditVoHandler {

    @EntityField(name = "nfddc.deployciauditvo.id.name", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "nfddc.deployciauditvo.ciid.name", type = ApiParamType.LONG)
    private Long ciId;
    @EntityField(name = "nfddc.deployciauditvo.commitid.name", type = ApiParamType.STRING)
    private String commitId;
    @EntityField(name = "nfddc.deployciauditvo.action.name", type = ApiParamType.STRING)
    private String action;
    @EntityField(name = "nfddc.deployciauditvo.actionname.name", type = ApiParamType.STRING)
    private String actionName;
    @EntityField(name = "nfddc.deployciauditvo.status.name", type = ApiParamType.STRING)
    private String status;
    @EntityField(name = "nfddc.deployciauditvo.statusname.name", type = ApiParamType.STRING)
    private String statusName;
    @EntityField(name = "nfddc.deployciauditvo.jobid.name", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "nfddc.deployciauditvo.jobname.name", type = ApiParamType.STRING)
    private String jobName;

    @EntityField(name = "nfddc.deployciauditvo.param.name", type = ApiParamType.STRING)
    private String param;
    @EntityField(name = "nfddc.deployciauditvo.result.name", type = ApiParamType.STRING)
    private Object result;
    @EntityField(name = "nfddc.deployciauditvo.error.name", type = ApiParamType.STRING)
    private String error;
    @EntityField(name = "nfddc.deployciauditvo.paramfilepath.name", type = ApiParamType.STRING)
    private String paramFilePath;
    @EntityField(name = "nfddc.deployciauditvo.resultfilepath.name", type = ApiParamType.STRING)
    private String resultFilePath;
    @EntityField(name = "nfddc.deployciauditvo.errorfilepath.name", type = ApiParamType.STRING)
    private String errorFilePath;
    @JSONField(serialize = false)
    private Integer serverId;

    public DeployCiAuditVo() {
    }

    public DeployCiAuditVo(Long ciId, String commitId, String action, String param) {
        this.ciId = ciId;
        this.commitId = commitId;
        this.action = action;
        this.param = param;
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

    public Long getCiId() {
        return ciId;
    }

    public void setCiId(Long ciId) {
        this.ciId = ciId;
    }

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getActionName() {
        if (StringUtils.isNotBlank(action) && StringUtils.isBlank(actionName)) {
            actionName = DeployCiActionType.getDeployCiActionTypeText(action);
        }
        return actionName;
    }

    public String getStatusName() {
        if (StringUtils.isNotBlank(status) && StringUtils.isBlank(statusName)) {
            statusName = DeployCiAuditStatus.getText(status);
        }
        return statusName;
    }

    @Override
    public String getParam() {
        return param;
    }

    @Override
    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public Object getResult() {
        return result;
    }

    @Override
    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String getError() {
        return error;
    }

    @Override
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String getParamFilePath() {
        return paramFilePath;
    }

    @Override
    public void setParamFilePath(String paramFilePath) {
        this.paramFilePath = paramFilePath;
    }

    @Override
    public String getResultFilePath() {
        return resultFilePath;
    }

    @Override
    public void setResultFilePath(String resultFilePath) {
        this.resultFilePath = resultFilePath;
    }

    @Override
    public String getErrorFilePath() {
        return errorFilePath;
    }

    @Override
    public void setErrorFilePath(String errorFilePath) {
        this.errorFilePath = errorFilePath;
    }

    public Integer getServerId() {
        if (serverId == null) {
            serverId = Config.SCHEDULE_SERVER_ID;
        }
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }
}
