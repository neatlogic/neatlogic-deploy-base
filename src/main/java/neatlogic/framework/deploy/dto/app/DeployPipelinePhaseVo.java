/*Copyright (C) 2023  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

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
