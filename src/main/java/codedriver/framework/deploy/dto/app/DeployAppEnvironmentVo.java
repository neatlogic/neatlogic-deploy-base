package codedriver.framework.deploy.dto.app;

import codedriver.framework.cmdb.dto.resourcecenter.entity.AppEnvironmentVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

/**
 * @author longrf
 * @date 2022/6/20 7:46 下午
 */
public class DeployAppEnvironmentVo extends AppEnvironmentVo {

    @EntityField(name = "环境id", type = ApiParamType.INTEGER)
    private Integer isEdit;

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }
}
