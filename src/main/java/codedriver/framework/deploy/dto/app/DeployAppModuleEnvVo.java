package codedriver.framework.deploy.dto.app;

import codedriver.framework.cmdb.dto.resourcecenter.entity.AppEnvironmentVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployAppModuleEnvVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "简称", type = ApiParamType.STRING)
    private String abbrName;
    @EntityField(name = "环境列表", type = ApiParamType.JSONARRAY)
    private List<AppEnvironmentVo> envList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrName() {
        return abbrName;
    }

    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName;
    }

    public List<AppEnvironmentVo> getEnvList() {
        return envList;
    }

    public void setEnvList(List<AppEnvironmentVo> envList) {
        this.envList = envList;
    }
}
