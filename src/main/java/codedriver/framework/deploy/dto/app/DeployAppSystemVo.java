/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.auth.core.AuthActionChecker;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.deploy.auth.DEPLOY_MODIFY;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Set;

/**
 * @author longrf
 * @date 2022/6/23 3:41 下午
 */
public class DeployAppSystemVo extends BaseEditorVo {
    private static final long serialVersionUID = 3794860793337591800L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "简称", type = ApiParamType.STRING)
    private String abbrName;
    @EntityField(name = "维护窗口", type = ApiParamType.STRING)
    private String maintenanceWindow;
    @EntityField(name = "备注", type = ApiParamType.STRING)
    private String description;
    @EntityField(name = "是否被收藏（1：收藏，0：取消收藏）", type = ApiParamType.INTEGER)
    private Integer isFavorite;
    @EntityField(name = "是否已配置（1：已配置，0：未配置）", type = ApiParamType.INTEGER)
    private Integer isConfig;
    @EntityField(name = "应用模块列表", type = ApiParamType.JSONARRAY)
    private List<DeployAppModuleVo> appModuleList;
    @EntityField(name = "状态id列表", type = ApiParamType.JSONARRAY)
    private List<Long> stateIdList;
    @EntityField(name = "负责人id列表", type = ApiParamType.JSONARRAY)
    private List<Long> ownerIdList;

    @EntityField(name = "是否包含模块", type = ApiParamType.INTEGER)
    private Integer isHasModule = 0;
    @EntityField(name = "是否包含环境", type = ApiParamType.INTEGER)
    private Integer isHasEnv = 0;
    @EntityField(name = "是否配置权限", type = ApiParamType.INTEGER)
    private Integer isConfigAuthority = 0;
    @EntityField(name = "是否拥有所有数据权限", type = ApiParamType.INTEGER)
    private Integer isHasAllAuthority;

    @JSONField(serialize = false)
    private List<DeployAppConfigAuthorityVo> authList;

    @JSONField(serialize = false)
    private List<Long> envIdList;

    @EntityField(name = "权限动作列表", type = ApiParamType.JSONARRAY)
    Set<String> authActionSet;

    public DeployAppSystemVo() {

    }

    public DeployAppSystemVo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DeployAppSystemVo(Long id, String name, String abbrName) {
        this.id = id;
        this.name = name;
        this.abbrName = abbrName;
    }

    public Long getId() {
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

    public String getAbbrName() {
        return abbrName;
    }

    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName;
    }

    public String getMaintenanceWindow() {
        return maintenanceWindow;
    }

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Integer getIsConfig() {
        return isConfig;
    }

    public void setIsConfig(Integer isConfig) {
        this.isConfig = isConfig;
    }

    public List<DeployAppModuleVo> getAppModuleList() {
        return appModuleList;
    }

    public void setAppModuleList(List<DeployAppModuleVo> appModuleList) {
        this.appModuleList = appModuleList;
    }

    public List<Long> getStateIdList() {
        return stateIdList;
    }

    public void setStateIdList(List<Long> stateIdList) {
        this.stateIdList = stateIdList;
    }

    public List<Long> getOwnerIdList() {
        return ownerIdList;
    }

    public void setOwnerIdList(List<Long> ownerIdList) {
        this.ownerIdList = ownerIdList;
    }

    public Integer getIsHasModule() {
        return isHasModule;
    }

    public void setIsHasModule(Integer isHasModule) {
        this.isHasModule = isHasModule;
    }

    public Integer getIsHasEnv() {
        return isHasEnv;
    }

    public void setIsHasEnv(Integer isHasEnv) {
        this.isHasEnv = isHasEnv;
    }

    public Integer getIsConfigAuthority() {
        return isConfigAuthority;
    }

    public void setIsConfigAuthority(Integer isConfigAuthority) {
        this.isConfigAuthority = isConfigAuthority;
    }

    public List<Long> getEnvIdList() {
        return envIdList;
    }

    public void setEnvIdList(List<Long> envIdList) {
        this.envIdList = envIdList;
    }

    public List<DeployAppConfigAuthorityVo> getAuthList() {
        return authList;
    }

    public void setAuthList(List<DeployAppConfigAuthorityVo> authList) {
        this.authList = authList;
    }

    public Set<String> getAuthActionSet() {
        return authActionSet;
    }

    public void setAuthActionSet(Set<String> authActionSet) {
        this.authActionSet = authActionSet;
    }

    public Integer getIsHasAllAuthority() {
        if (isHasAllAuthority == null) {
            if (AuthActionChecker.check(DEPLOY_MODIFY.class)) {
                isHasAllAuthority = 1;
            } else {
                isHasAllAuthority = 0;
            }
        }
        return isHasAllAuthority;
    }
    public void setIsHasAllAuthority(Integer isHasAllAuthority) {
        this.isHasAllAuthority = isHasAllAuthority;
    }
}
