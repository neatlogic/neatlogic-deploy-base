/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployAppConfigAuthorityActionVo {
    private static final long serialVersionUID = 3794860793315891800L;

    @EntityField(name = "授权操作", type = ApiParamType.STRING)
    private String action;
    @EntityField(name = "授权操作类型", type = ApiParamType.STRING)
    private String type;

    public DeployAppConfigAuthorityActionVo(String action, String type) {
        this.action = action;
        this.type = type;
    }

    public DeployAppConfigAuthorityActionVo() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeActionString() {
        return type + "#" + action;
    }
}
