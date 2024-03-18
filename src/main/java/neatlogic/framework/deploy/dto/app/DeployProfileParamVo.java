/*Copyright (C) $today.year  深圳极向量科技有限公司 All Rights Reserved.

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

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.autoexec.dto.AutoexecParamVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployProfileParamVo extends AutoexecParamVo {

    @JSONField(serialize = false)
    @EntityField(name = "来源", type = ApiParamType.STRING)
    private String source;
    @EntityField(name = "继承", type = ApiParamType.INTEGER)
    private Integer inherit;

    public DeployProfileParamVo() {

    }

    public DeployProfileParamVo(AutoexecParamVo autoexecParamVo) {
        super.setId(autoexecParamVo.getId());
        super.setKey(autoexecParamVo.getKey());
        super.setName(autoexecParamVo.getName());
        super.setDefaultValue(autoexecParamVo.getDefaultValue());
        super.setMode(autoexecParamVo.getMode());
        super.setType(autoexecParamVo.getType());
        super.setIsRequired(autoexecParamVo.getIsRequired());
        super.setDescription(autoexecParamVo.getDescription());
        super.setSort(autoexecParamVo.getSort());
        super.setValidate(autoexecParamVo.getValidate());
        super.setOperationId(autoexecParamVo.getOperationId());
        super.setOperationType(autoexecParamVo.getOperationType());
        if (autoexecParamVo.getConfig() != null) {
            super.setConfig(JSONObject.toJSONString(autoexecParamVo.getConfig()));

        }
        super.setArgumentCount(autoexecParamVo.getArgumentCount());
        super.setMappingMode(autoexecParamVo.getMappingMode());
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getInherit() {
        return inherit;
    }

    public void setInherit(Integer inherit) {
        this.inherit = inherit;
    }
}
