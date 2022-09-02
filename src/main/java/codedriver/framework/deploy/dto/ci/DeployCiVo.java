package codedriver.framework.deploy.dto.ci;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

public class DeployCiVo extends BaseEditorVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "模块名称", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "模块简称", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "仓库类型", type = ApiParamType.STRING)
    private String repoType;
    @EntityField(name = "仓库服务器地址", type = ApiParamType.STRING)
    private String repoServerAddress;
    @EntityField(name = "仓库名称", type = ApiParamType.STRING)
    private String repoName;
    @EntityField(name = "分支", type = ApiParamType.JSONARRAY)
    private JSONArray branches;
    @EntityField(name = "事件", type = ApiParamType.STRING)
    private String event;
    @EntityField(name = "动作类型", type = ApiParamType.STRING)
    private String action;
    @EntityField(name = "触发方式", type = ApiParamType.STRING)
    private String triggerType;
    @EntityField(name = "触发时间", type = ApiParamType.STRING)
    private String triggerTime;
    @EntityField(name = "版本号规则", type = ApiParamType.JSONOBJECT)
    private JSONObject versionRule;
    @EntityField(name = "配置", type = ApiParamType.JSONOBJECT)
    private JSONObject config;

    @JSONField(serialize = false)
    private String branchesStr;
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

    public JSONArray getBranches() {
        if (CollectionUtils.isEmpty(branches) && StringUtils.isNotBlank(branchesStr)) {
            branches = JSONArray.parseArray(branchesStr);
        }
        return branches;
    }

    public void setBranches(JSONArray branches) {
        this.branches = branches;
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

    public String getBranchesStr() {
        if (StringUtils.isBlank(branchesStr) && CollectionUtils.isNotEmpty(branches)) {
            branchesStr = branches.toJSONString();
        }
        return branchesStr;
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
}
