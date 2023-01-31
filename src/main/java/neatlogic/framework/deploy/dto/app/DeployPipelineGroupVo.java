/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.autoexec.dto.combop.AutoexecCombopGroupVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployPipelineGroupVo extends AutoexecCombopGroupVo {
    @EntityField(name = "重载", type = ApiParamType.INTEGER)
    private Integer inherit;

    public Integer getInherit() {
        return inherit;
    }

    public void setInherit(Integer inherit) {
        this.inherit = inherit;
    }
}
