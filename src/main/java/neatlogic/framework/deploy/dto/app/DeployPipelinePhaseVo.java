/*
Copyright(c) $today.year NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. 
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
