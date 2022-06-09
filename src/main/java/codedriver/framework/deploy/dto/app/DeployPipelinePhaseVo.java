/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.autoexec.dto.combop.AutoexecCombopPhaseVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

public class DeployPipelinePhaseVo extends AutoexecCombopPhaseVo {
    @EntityField(name = "启用", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "重载", type = ApiParamType.INTEGER)
    private Integer override;
    @EntityField(name = "继承", type = ApiParamType.STRING)
    private String inherit;

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getOverride() {
        return override;
    }

    public void setOverride(Integer override) {
        this.override = override;
    }

    public String getInherit() {
        return inherit;
    }

    public void setInherit(String inherit) {
        this.inherit = inherit;
    }
}
