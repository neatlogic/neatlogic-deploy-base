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

import neatlogic.framework.autoexec.dto.combop.ParamMappingVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

import java.io.Serializable;

public class DeployPipelineExecuteConfigVo implements Serializable {

    @EntityField(name = "协议id", type = ApiParamType.LONG)
    private Long protocolId;
    @EntityField(name = "执行用户", type = ApiParamType.JSONOBJECT)
    private ParamMappingVo executeUser;
    @EntityField(name = "重载", type = ApiParamType.INTEGER)
    private Integer inherit;

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public ParamMappingVo getExecuteUser() {
        return executeUser;
    }

    public void setExecuteUser(ParamMappingVo executeUser) {
        this.executeUser = executeUser;
    }

    public Integer getInherit() {
        return inherit;
    }

    public void setInherit(Integer inherit) {
        this.inherit = inherit;
    }
}
