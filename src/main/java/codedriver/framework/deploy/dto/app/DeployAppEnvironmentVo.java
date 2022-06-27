package codedriver.framework.deploy.dto.app;

import codedriver.framework.cmdb.dto.resourcecenter.entity.AppModuleVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

/**
 * @author longrf
 * @date 2022/6/20 7:46 下午
 */
public class DeployAppEnvironmentVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "是否可编辑", type = ApiParamType.INTEGER)
    private Integer isEdit;
    @EntityField(name = "应用模块列表", type = ApiParamType.JSONARRAY)
    private List<AppModuleVo> appModuleList;

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

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }

    public List<AppModuleVo> getAppModuleList() {
        return appModuleList;
    }

    public void setAppModuleList(List<AppModuleVo> appModuleList) {
        this.appModuleList = appModuleList;
    }
}
