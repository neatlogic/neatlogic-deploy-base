package codedriver.framework.deploy.dto.ci;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public class DeployCiVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "系统id", type = ApiParamType.LONG)
    private Integer appSystemId;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Integer appModuleId;
    @EntityField(name = "仓库类型", type = ApiParamType.STRING)
    private String repoType;
    @EntityField(name = "仓库服务器地址", type = ApiParamType.STRING)
    private String repoServerAddress;
    @EntityField(name = "仓库名称", type = ApiParamType.STRING)
    private String repoName;
    @EntityField(name = "分支", type = ApiParamType.JSONARRAY)
    private String branch;
    @EntityField(name = "事件", type = ApiParamType.STRING)
    private String event;
    @EntityField(name = "动作类型", type = ApiParamType.STRING)
    private String action;
    @EntityField(name = "触发方式", type = ApiParamType.STRING)
    private String triggerType;
    @EntityField(name = "触发时间", type = ApiParamType.LONG)
    private Date triggerTime;
    @EntityField(name = "版本号规则", type = ApiParamType.JSONOBJECT)
    private JSONObject versionRule;
    @EntityField(name = "配置", type = ApiParamType.JSONOBJECT)
    private String config;

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

    public Integer getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Integer appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Integer getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Integer appModuleId) {
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
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

    public Date getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    public JSONObject getVersionRule() {
        return versionRule;
    }

    public void setVersionRule(JSONObject versionRule) {
        this.versionRule = versionRule;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
