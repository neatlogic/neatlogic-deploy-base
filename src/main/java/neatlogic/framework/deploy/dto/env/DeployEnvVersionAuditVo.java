package neatlogic.framework.deploy.dto.env;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.constvalue.VersionDirection;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

public class DeployEnvVersionAuditVo extends BaseEditorVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "新版本id", type = ApiParamType.LONG)
    private Long newVersionId;
    @EntityField(name = "新版本号", type = ApiParamType.STRING)
    private String newVersion;
    @EntityField(name = "旧版本id", type = ApiParamType.LONG)
    private Long oldVersionId;
    @EntityField(name = "旧版本号", type = ApiParamType.STRING)
    private String oldVersion;
    @EntityField(name = "新编译号", type = ApiParamType.INTEGER)
    private Integer newBuildNo;
    @EntityField(name = "旧编译号", type = ApiParamType.INTEGER)
    private Integer oldBuildNo;
    @EntityField(name = "方向", type = ApiParamType.ENUM, member = VersionDirection.class)
    private String direction;

    public DeployEnvVersionAuditVo() {
    }

    public DeployEnvVersionAuditVo(Long appSystemId, Long appModuleId, Long envId, Long newVersionId, Long oldVersionId, Integer newBuildNo, Integer oldBuildNo, String direction) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.newVersionId = newVersionId;
        this.oldVersionId = oldVersionId;
        this.newBuildNo = newBuildNo;
        this.oldBuildNo = oldBuildNo;
        this.direction = direction;
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

    public Long getNewVersionId() {
        return newVersionId;
    }

    public void setNewVersionId(Long newVersionId) {
        this.newVersionId = newVersionId;
    }

    public Long getOldVersionId() {
        return oldVersionId;
    }

    public void setOldVersionId(Long oldVersionId) {
        this.oldVersionId = oldVersionId;
    }

    public Integer getNewBuildNo() {
        return newBuildNo;
    }

    public void setNewBuildNo(Integer newBuildNo) {
        this.newBuildNo = newBuildNo;
    }

    public Integer getOldBuildNo() {
        return oldBuildNo;
    }

    public void setOldBuildNo(Integer oldBuildNo) {
        this.oldBuildNo = oldBuildNo;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getNewVersion() {
        return newVersion;
    }

    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
    }

    public String getOldVersion() {
        return oldVersion;
    }

    public void setOldVersion(String oldVersion) {
        this.oldVersion = oldVersion;
    }
}
