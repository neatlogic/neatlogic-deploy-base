package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.deploy.dto.env.DeployEnvVersionVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployModuleActiveVersionVo {

    @EntityField(name = "term.cmdb.appsystemid", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "term.cmdb.appsystemabbrname", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "term.cmdb.appsystemname", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "term.cmdb.appmoduleid", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "term.cmdb.appmoduleabbrname", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "term.cmdb.appmodulename", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "term.cmdb.envlist", type = ApiParamType.JSONARRAY)
    private List<DeployEnvVersionVo> envList;
    @EntityField(name = "nfddv.deploymoduleactiveversionvo.versionlist.name", type = ApiParamType.JSONARRAY)
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
