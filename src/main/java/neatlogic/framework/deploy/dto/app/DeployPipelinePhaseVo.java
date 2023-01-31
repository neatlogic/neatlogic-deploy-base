/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.autoexec.dto.combop.AutoexecCombopPhaseVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployPipelinePhaseVo extends AutoexecCombopPhaseVo {

    @EntityField(name = "父级启用", type = ApiParamType.INTEGER)
    private Integer parentIsActive;
    @EntityField(name = "启用", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "重载", type = ApiParamType.INTEGER)
    private Integer override;
    @EntityField(name = "来源", type = ApiParamType.STRING)
    private String source;

    public Integer getParentIsActive() {
        return parentIsActive;
    }

    public void setParentIsActive(Integer parentIsActive) {
        this.parentIsActive = parentIsActive;
    }

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
