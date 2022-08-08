package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployModuleActiveVersionVo {

    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用系统名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "应用模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "应用模块名称", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "版本列表", type = ApiParamType.JSONARRAY)
    private List<DeployActiveVersionVo> versionList;

    public DeployModuleActiveVersionVo() {
    }

    public DeployModuleActiveVersionVo(Long appSystemId, Long appModuleId) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public String getAppModuleName() {
        return appModuleName;
    }

    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName;
    }

    public List<DeployActiveVersionVo> getVersionList() {
        return versionList;
    }

    public void setVersionList(List<DeployActiveVersionVo> versionList) {
        this.versionList = versionList;
    }
}
