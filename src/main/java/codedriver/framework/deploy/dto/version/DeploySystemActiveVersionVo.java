package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

public class DeploySystemActiveVersionVo extends BasePageVo {

    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用系统名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "模块列表", type = ApiParamType.JSONARRAY)
    private List<DeployModuleActiveVersionVo> moduleList;

    public DeploySystemActiveVersionVo() {
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

    public List<DeployModuleActiveVersionVo> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<DeployModuleActiveVersionVo> moduleList) {
        this.moduleList = moduleList;
    }
}
