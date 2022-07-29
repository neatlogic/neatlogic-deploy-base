package codedriver.framework.deploy.dto.instance;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;

public class DeployInstanceVersionVo extends BaseEditorVo {
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "实例id", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "编译号", type = ApiParamType.INTEGER)
    private Integer buildNo;

    public DeployInstanceVersionVo() {
    }

    public DeployInstanceVersionVo(Long appSystemId, Long appModuleId, Long envId, Long resourceId, Long versionId, Integer buildNo) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.resourceId = resourceId;
        this.versionId = versionId;
        this.buildNo = buildNo;
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
}
