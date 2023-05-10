/*
Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.

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

import neatlogic.framework.autoexec.dto.AutoexecParamVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

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
