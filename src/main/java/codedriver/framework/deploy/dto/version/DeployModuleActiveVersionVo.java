package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.deploy.dto.env.DeployEnvVersionVo;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployModuleActiveVersionVo {

    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用系统简称", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "应用系统名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "应用模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "应用模块简称", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "应用模块名称", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "环境列表", type = ApiParamType.JSONARRAY)
    private List<DeployEnvVersionVo> envList;
    @EntityField(name = "版本列表", type = ApiParamType.JSONARRAY)
    private List<DeployActiveVersionVo> versionList;

    public DeployModuleActiveVersionVo() {
    }

    public DeployModuleActiveVersionVo(Long appSystemId, Long appModuleId, String appModuleAbbrName, String appModuleName) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.appModuleAbbrName = appModuleAbbrName;
        this.appModuleName = appModuleName;
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

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public String getAppModuleAbbrName() {
        return appModuleAbbrName;
    }

    public void setAppModuleAbbrName(String appModuleAbbrName) {
        this.appModuleAbbrName = appModuleAbbrName;
    }

    public List<DeployEnvVersionVo> getEnvList() {
        return envList;
    }

    public void setEnvList(List<DeployEnvVersionVo> envList) {
        this.envList = envList;
    }

    public List<DeployActiveVersionVo> getVersionList() {
        return versionList;
    }

    public void setVersionList(List<DeployActiveVersionVo> versionList) {
        this.versionList = versionList;
    }
}
