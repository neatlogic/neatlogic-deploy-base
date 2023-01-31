package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.cmdb.dto.resourcecenter.entity.AppModuleVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @author longrf
 * @date 2022/6/20 7:46 下午
 */
public class DeployAppEnvironmentVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "应用模块列表", type = ApiParamType.JSONARRAY)
    private List<AppModuleVo> appModuleList;
    @EntityField(name = "是否可删除", type = ApiParamType.INTEGER)
    private Integer isDeletable;
    @EntityField(name = "是否配置", type = ApiParamType.INTEGER)
    private Integer isConfig;

    @JSONField(serialize = false)
    private List<DeployAppConfigEnvDBConfigVo> dbSchemaList;
    @JSONField(serialize = false)
    private List<DeployAppEnvAutoConfigKeyValueVo> autoCfgKeyValueList;

    @EntityField(name = "流水线配置中是否存在禁用阶段", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "流水线配置中是否存在重载阶段", type = ApiParamType.INTEGER)
    private Integer override;

    public DeployAppEnvironmentVo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DeployAppEnvironmentVo() {
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

    public List<AppModuleVo> getAppModuleList() {
        return appModuleList;
    }

    public void setAppModuleList(List<AppModuleVo> appModuleList) {
        this.appModuleList = appModuleList;
    }

    public Integer getIsDeletable() {
        return isDeletable;
    }

    public void setIsDeletable(Integer isDeletable) {
        this.isDeletable = isDeletable;
    }

    public Integer getIsConfig() {
        return isConfig;
    }

    public void setIsConfig(Integer isConfig) {
        this.isConfig = isConfig;
    }

    public List<DeployAppConfigEnvDBConfigVo> getDbSchemaList() {
        return dbSchemaList;
    }

    public void setDbSchemaList(List<DeployAppConfigEnvDBConfigVo> dbSchemaList) {
        this.dbSchemaList = dbSchemaList;
    }

    public List<DeployAppEnvAutoConfigKeyValueVo> getAutoCfgKeyValueList() {
        return autoCfgKeyValueList;
    }

    public void setAutoCfgKeyValueList(List<DeployAppEnvAutoConfigKeyValueVo> autoCfgKeyValueList) {
        this.autoCfgKeyValueList = autoCfgKeyValueList;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getOverride() {
        return override;
    }

    public void setOverride(Integer override) {
        this.override = override;
    }
}
