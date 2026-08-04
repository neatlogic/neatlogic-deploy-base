package neatlogic.framework.deploy.dto.ci;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.constvalue.DeployCiActionType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

public class DeployCiVo extends BaseEditorVo {

    @EntityField(name = "nfddc.deploycivo.id.name", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "nfddc.deploycivo.name.name", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "nfddc.deploycivo.isactive.name", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "nfddc.deploycivo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfddc.deploycivo.appmoduleid.name", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "nfddc.deploycivo.appmodulename.name", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "nfddc.deploycivo.appmoduleabbrname.name", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "nfddc.deploycivo.repotype.name", type = ApiParamType.STRING)
    private String repoType;
    @EntityField(name = "nfddc.deploycivo.reposerveraddress.name", type = ApiParamType.STRING)
    private String repoServerAddress;
    @EntityField(name = "nfddc.deploycivo.reponame.name", type = ApiParamType.STRING)
    private String repoName;
    @EntityField(name = "nfddc.deploycivo.branchfilter.name", type = ApiParamType.STRING)
    private String branchFilter;
    @EntityField(name = "nfddc.deploycivo.event.name", type = ApiParamType.STRING)
    private String event;
    @EntityField(name = "nfddc.deploycivo.action.name", type = ApiParamType.STRING)
    private String action;
    @EntityField(name = "nfddc.deploycivo.actionname.name", type = ApiParamType.STRING)
    private String actionName;
    @EntityField(name = "nfddc.deploycivo.triggertype.name", type = ApiParamType.STRING)
    private String triggerType;
    @EntityField(name = "nfddc.deploycivo.triggertime.name", type = ApiParamType.STRING)
    private String triggerTime;
    @EntityField(name = "nfddc.deploycivo.delaytime.name", type = ApiParamType.INTEGER)
    private Integer delayTime;
    @EntityField(name = "nfddc.deploycivo.versionrule.name", type = ApiParamType.JSONOBJECT)
    private JSONObject versionRule;
    @EntityField(name = "nfddc.deploycivo.config.name", type = ApiParamType.JSONOBJECT)
    private JSONObject config;
    @EntityField(name = "nfddc.deploycivo.hookid.name", type = ApiParamType.STRING)
    private String hookId;

    @JSONField(serialize = false)
    private String versionRuleStr;
    @JSONField(serialize = false)
    private String configStr;

    public DeployCiVo() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public String getRepoServerAddress() {
        return repoServerAddress;
    }

    public void setRepoServerAddress(String repoServerAddress) {
        this.repoServerAddress = repoServerAddress;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getBranchFilter() {
        return branchFilter;
    }

    public void setBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public String getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }

    public JSONObject getVersionRule() {
        if (MapUtils.isEmpty(versionRule) && StringUtils.isNotBlank(versionRuleStr)) {
            versionRule = JSONObject.parseObject(versionRuleStr);
        }
        return versionRule;
    }

    public void setVersionRule(JSONObject versionRule) {
        this.versionRule = versionRule;
    }

    public JSONObject getConfig() {
        if (MapUtils.isEmpty(config) && StringUtils.isNotBlank(configStr)) {
            config = JSONObject.parseObject(configStr);
        }
        return config;
    }

    public void setConfig(JSONObject config) {
        this.config = config;
    }

    public String getHookId() {
        return hookId;
    }

    public void setHookId(String hookId) {
        this.hookId = hookId;
    }

    public String getVersionRuleStr() {
        if (StringUtils.isBlank(versionRuleStr) && MapUtils.isNotEmpty(versionRule)) {
            versionRuleStr = versionRule.toJSONString();
        }
        return versionRuleStr;
    }

    public String getConfigStr() {
        if (StringUtils.isBlank(configStr) && MapUtils.isNotEmpty(config)) {
            configStr = config.toJSONString();
        }
        return configStr;
    }

    public String getAppModuleName() {
        return appModuleName;
    }

    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName;
    }

    public String getAppModuleAbbrName() {
        return appModuleAbbrName;
    }

    public void setAppModuleAbbrName(String appModuleAbbrName) {
        this.appModuleAbbrName = appModuleAbbrName;
    }

    public String getActionName() {
        if (StringUtils.isNotBlank(action) && StringUtils.isBlank(actionName)) {
            actionName = DeployCiActionType.getDeployCiActionTypeText(action);
        }
        return actionName;
    }

    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }
}
