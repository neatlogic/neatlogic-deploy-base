package neatlogic.framework.deploy.dto.env;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.Date;

public class DeployEnvVersionVo extends BaseEditorVo {
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "环境名称", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "版本", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "编译号", type = ApiParamType.INTEGER)
    private Integer buildNo;
    @EntityField(name = "发布状态", type = ApiParamType.STRING)
    private String status;
    @EntityField(name = "发布时间", type = ApiParamType.LONG)
    private Date deployTime;
    @EntityField(name = "回滚时间", type = ApiParamType.LONG)
    private Date rollbackTime;

    public DeployEnvVersionVo() {
    }

    public DeployEnvVersionVo(Long appSystemId, Long appModuleId, Long envId, Long versionId, Integer buildNo) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.versionId = versionId;
        this.buildNo = buildNo;
    }

    public DeployEnvVersionVo(Long appSystemId, Long appModuleId, Long envId, Long versionId, Integer buildNo, String lcu, Date lcd) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.versionId = versionId;
        this.buildNo = buildNo;
        super.setLcu(lcu);
        super.setLcd(lcd);
    }

    public DeployEnvVersionVo(Long envId, String envName, String status) {
        this.envId = envId;
        this.envName = envName;
        this.status = status;
    }

    public DeployEnvVersionVo(Long envId, String status) {
        this.envId = envId;
        this.status = status;
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

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeployTime() {
        return deployTime;
    }

    public void setDeployTime(Date deployTime) {
        this.deployTime = deployTime;
    }

    public Date getRollbackTime() {
        return rollbackTime;
    }

    public void setRollbackTime(Date rollbackTime) {
        this.rollbackTime = rollbackTime;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
