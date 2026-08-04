package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.List;

public class DeploySystemActiveVersionVo extends BasePageVo {

    @EntityField(name = "nfddv.deploysystemactiveversionvo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfddv.deploysystemactiveversionvo.appsystemabbrname.name", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "nfddv.deploysystemactiveversionvo.appsystemname.name", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "nfddv.deploysystemactiveversionvo.modulelist.name", type = ApiParamType.JSONARRAY)
    private List<DeployModuleActiveVersionVo> moduleList;

    public DeploySystemActiveVersionVo() {
    }

    public DeploySystemActiveVersionVo(Long appSystemId, String appSystemAbbrName, String appSystemName) {
        this.appSystemId = appSystemId;
        this.appSystemAbbrName = appSystemAbbrName;
        this.appSystemName = appSystemName;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public List<DeployModuleActiveVersionVo> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<DeployModuleActiveVersionVo> moduleList) {
        this.moduleList = moduleList;
    }
}
