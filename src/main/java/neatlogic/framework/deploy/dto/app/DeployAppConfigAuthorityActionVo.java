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

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployAppConfigAuthorityActionVo {
    private static final long serialVersionUID = 3794860793315891800L;

    @EntityField(name = "nfdda.deployappconfigauthorityactionvo.action.name", type = ApiParamType.STRING)
    private String action;
    @EntityField(name = "nfdda.deployappconfigauthorityactionvo.type.name", type = ApiParamType.STRING)
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
