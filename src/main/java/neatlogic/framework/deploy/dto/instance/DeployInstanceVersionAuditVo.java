package neatlogic.framework.deploy.dto.instance;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.constvalue.VersionDirection;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

public class DeployInstanceVersionAuditVo extends BaseEditorVo {
    @EntityField(name = "nfddi.deployinstanceversionauditvo.id.name", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "nfddi.deployinstanceversionauditvo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfddi.deployinstanceversionauditvo.appmoduleid.name", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "nfddi.deployinstanceversionauditvo.envid.name", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "nfddi.deployinstanceversionauditvo.resourceid.name", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "nfddi.deployinstanceversionauditvo.newversionid.name", type = ApiParamType.LONG)
    private Long newVersionId;
    @EntityField(name = "nfddi.deployinstanceversionauditvo.oldversionid.name", type = ApiParamType.LONG)
    private Long oldVersionId;
    @EntityField(name = "nfddi.deployinstanceversionauditvo.newbuildno.name", type = ApiParamType.INTEGER)
    private Integer newBuildNo;
    @EntityField(name = "nfddi.deployinstanceversionauditvo.oldbuildno.name", type = ApiParamType.INTEGER)
    private Integer oldBuildNo;
    @EntityField(name = "nfddi.deployinstanceversionauditvo.direction.name", type = ApiParamType.ENUM, member = VersionDirection.class)
    private String direction;

    public DeployInstanceVersionAuditVo() {
    }

    public DeployInstanceVersionAuditVo(Long appSystemId, Long appModuleId, Long envId, Long resourceId, Long newVersionId, Long oldVersionId, Integer newBuildNo, Integer oldBuildNo, String direction) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.resourceId = resourceId;
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

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
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
}
