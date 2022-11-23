/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.autoexec.dto.combop.AutoexecCombopGroupVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

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
