/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

package neatlogic.framework.deploy.dto.app;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.autoexec.dto.AutoexecParamVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployProfileParamVo extends AutoexecParamVo {

    @JSONField(serialize = false)
    @EntityField(name = "nfdda.deployprofileparamvo.source.name", type = ApiParamType.STRING)
    private String source;
    @EntityField(name = "nfdda.deployprofileparamvo.inherit.name", type = ApiParamType.INTEGER)
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
