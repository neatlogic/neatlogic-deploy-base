package neatlogic.framework.deploy.dto.env;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.constvalue.VersionDirection;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

public class DeployEnvVersionAuditVo extends BaseEditorVo {
    @EntityField(name = "nfdde.deployenvversionauditvo.id.name", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "nfdde.deployenvversionauditvo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfdde.deployenvversionauditvo.appmoduleid.name", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "nfdde.deployenvversionauditvo.envid.name", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "nfdde.deployenvversionauditvo.newversionid.name", type = ApiParamType.LONG)
    private Long newVersionId;
    @EntityField(name = "nfdde.deployenvversionauditvo.newversion.name", type = ApiParamType.STRING)
    private String newVersion;
    @EntityField(name = "nfdde.deployenvversionauditvo.oldversionid.name", type = ApiParamType.LONG)
    private Long oldVersionId;
    @EntityField(name = "nfdde.deployenvversionauditvo.oldversion.name", type = ApiParamType.STRING)
    private String oldVersion;
    @EntityField(name = "nfdde.deployenvversionauditvo.newbuildno.name", type = ApiParamType.INTEGER)
    private Integer newBuildNo;
    @EntityField(name = "nfdde.deployenvversionauditvo.oldbuildno.name", type = ApiParamType.INTEGER)
    private Integer oldBuildNo;
    @EntityField(name = "nfdde.deployenvversionauditvo.direction.name", type = ApiParamType.ENUM, member = VersionDirection.class)
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
