package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @author longrf
 * @date 2022/6/23 3:41 下午
 */
public class DeployAppModuleVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "简称", type = ApiParamType.STRING)
    private String abbrName;
    @EntityField(name = "维护窗口", type = ApiParamType.STRING)
    private List<String> maintenanceWindow;
    @EntityField(name = "备注", type = ApiParamType.STRING)
    private String description;
    @EntityField(name = "是否有环境（1：有，0：没有）", type = ApiParamType.INTEGER)
    private Integer isHasEnv = 0;
    @EntityField(name = "是否有配置（1：有，0：没有）", type = ApiParamType.INTEGER)
    private Integer isConfig;
    @EntityField(name = "系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    //发布作业：当前场景是否有BUILD分类的工具，前端需要根据此标识调用 不同的选择版本下拉接口
    @EntityField(name = "是否拥有BUILD类型的工具库工具", type = ApiParamType.INTEGER)
    private int isHasBuildTypeTool = 0;
    @EntityField(name = "是否拥有DEPLOY类型的工具库工具", type = ApiParamType.INTEGER)
    private int isHasDeployTypeTool = 0;
    @EntityField(name = "状态id列表", type = ApiParamType.JSONARRAY)
    private List<Long> state;
    @EntityField(name = "负责人id列表", type = ApiParamType.JSONARRAY)
    private List<Long> owner;
    @EntityField(name = "是否有配置执行器（1：有，0：没有）", type = ApiParamType.INTEGER)
    private Integer isHasRunner = 0;

    @JSONField(serialize = false)
    private List<DeployAppEnvironmentVo> envList;

    private List<DeployAppConfigInstanceVo> instanceVoList;

    public DeployAppModuleVo() {
    }

    public DeployAppModuleVo(Long id, String name, String abbrName) {
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

    public Integer getIsHasEnv() {
        return isHasEnv;
    }

    public void setIsHasEnv(Integer isHasEnv) {
        this.isHasEnv = isHasEnv;
    }

    public Integer getIsConfig() {
        return isConfig;
    }

    public void setIsConfig(Integer isConfig) {
        this.isConfig = isConfig;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public List<DeployAppConfigInstanceVo> getInstanceVoList() {
        return instanceVoList;
    }

    public void setInstanceVoList(List<DeployAppConfigInstanceVo> instanceVoList) {
        this.instanceVoList = instanceVoList;
    }

    public int getIsHasBuildTypeTool() {
        return isHasBuildTypeTool;
    }

    public void setIsHasBuildTypeTool(int isHasBuildTypeTool) {
        this.isHasBuildTypeTool = isHasBuildTypeTool;
    }

    public int getIsHasDeployTypeTool() {
        return isHasDeployTypeTool;
    }

    public void setIsHasDeployTypeTool(int isHasDeployTypeTool) {
        this.isHasDeployTypeTool = isHasDeployTypeTool;
    }

    public List<String> getMaintenanceWindow() {
        return maintenanceWindow;
    }

    public void setMaintenanceWindow(List<String> maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getState() {
        return state;
    }

    public void setState(List<Long> state) {
        this.state = state;
    }

    public List<Long> getOwner() {
        return owner;
    }

    public void setOwner(List<Long> owner) {
        this.owner = owner;
    }

    public Integer getIsHasRunner() {
        return isHasRunner;
    }

    public void setIsHasRunner(Integer isHasRunner) {
        this.isHasRunner = isHasRunner;
    }

    public List<DeployAppEnvironmentVo> getEnvList() {
        return envList;
    }

    public void setEnvList(List<DeployAppEnvironmentVo> envList) {
        this.envList = envList;
    }
}
