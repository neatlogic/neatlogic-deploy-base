package neatlogic.framework.deploy.dto.instance;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.Date;

public class DeployInstanceVersionVo extends BaseEditorVo {
    @EntityField(name = "term.cmdb.appsystemid", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "term.cmdb.appmoduleid", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "term.cmdb.envid", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "term.cmdb.resourceid", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "common.versionid", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "term.deploy.version", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "nfddi.deployinstanceversionvo.buildno.name", type = ApiParamType.INTEGER)
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

    public DeployInstanceVersionVo(Long appSystemId, Long appModuleId, Long envId, Long resourceId, Long versionId, Integer buildNo, String lcu, Date lcd) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.resourceId = resourceId;
        this.versionId = versionId;
        this.buildNo = buildNo;
        super.setLcu(lcu);
        super.setLcd(lcd);
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }
}
