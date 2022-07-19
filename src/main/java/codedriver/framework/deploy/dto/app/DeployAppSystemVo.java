/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

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
    @EntityField(name = "状态id列表", type = ApiParamType.JSONARRAY)
    private List<Long> statusIdList;
    @EntityField(name = "负责人id列表", type = ApiParamType.JSONARRAY)
    private List<Long> ownerIdList;
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
    @EntityField(name = "状态列表", type = ApiParamType.JSONARRAY)
    private List<DeployAppSystemStateVo> statusList;
    @EntityField(name = "负责人列表", type = ApiParamType.JSONARRAY)
    private List<DeployAppSystemOwnerVo> ownerList;

    @EntityField(name = "是否包含模块", type = ApiParamType.INTEGER)
    private Integer isHasModule = 0;
    @EntityField(name = "是否包含环境", type = ApiParamType.INTEGER)
    private Integer isHasEnv = 0;

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

    public List<Long> getStatusIdList() {
        return statusIdList;
    }

    public void setStatusIdList(List<Long> statusIdList) {
        this.statusIdList = statusIdList;
    }

    public List<Long> getOwnerIdList() {
        return ownerIdList;
    }

    public void setOwnerIdList(List<Long> ownerIdList) {
        this.ownerIdList = ownerIdList;
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

    public List<DeployAppSystemStateVo> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<DeployAppSystemStateVo> statusList) {
        this.statusList = statusList;
    }

    public List<DeployAppSystemOwnerVo> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<DeployAppSystemOwnerVo> ownerList) {
        this.ownerList = ownerList;
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
}
