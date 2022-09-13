package codedriver.framework.deploy.dto.ci;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.deploy.constvalue.DeployCiActionType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

public class DeployCiAuditVo extends BaseEditorVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "持续集成id", type = ApiParamType.LONG)
    private Long ciId;
    @EntityField(name = "提交ID", type = ApiParamType.STRING)
    private String commitId;
    @EntityField(name = "动作", type = ApiParamType.STRING)
    private String action;
    @EntityField(name = "动作类型名称", type = ApiParamType.STRING)
    private String actionName;
    @EntityField(name = "状态", type = ApiParamType.STRING)
    private String status;
    @EntityField(name = "作业ID", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "作业名称", type = ApiParamType.STRING)
    private String jobName;

    public DeployCiAuditVo() {
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
            DeployCiActionType actionType = DeployCiActionType.getDeployCiActionType(action);
            if (actionType != null) {
                actionName = actionType.getText();
            }
        }
        return actionName;
    }
}
