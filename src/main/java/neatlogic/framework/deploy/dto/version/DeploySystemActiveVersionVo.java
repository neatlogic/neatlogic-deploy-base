package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.List;

public class DeploySystemActiveVersionVo extends BasePageVo {

    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用系统简称", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "应用系统名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "模块列表", type = ApiParamType.JSONARRAY)
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
