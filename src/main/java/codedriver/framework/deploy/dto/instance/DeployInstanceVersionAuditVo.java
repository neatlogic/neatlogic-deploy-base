package codedriver.framework.deploy.dto.instance;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.deploy.constvalue.VersionDirection;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

public class DeployInstanceVersionAuditVo extends BaseEditorVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "实例id", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "新版本id", type = ApiParamType.LONG)
    private Long newVersionId;
    @EntityField(name = "旧版本id", type = ApiParamType.LONG)
    private Long oldVersionId;
    @EntityField(name = "新编译号", type = ApiParamType.INTEGER)
    private Integer newBuildNo;
    @EntityField(name = "旧编译号", type = ApiParamType.INTEGER)
    private Integer oldBuildNo;
    @EntityField(name = "方向", type = ApiParamType.ENUM, member = VersionDirection.class)
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
