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

package neatlogic.framework.deploy.dto.webhook;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployJobWebhookAppModuleVo {
    @EntityField(name = "nfddw.deployjobwebhookappmodulevo.webhookid.name", type = ApiParamType.LONG)
    private Long webhookId;
    @EntityField(name = "nfddw.deployjobwebhookappmodulevo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfddw.deployjobwebhookappmodulevo.appsystemabbrname.name", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "nfddw.deployjobwebhookappmodulevo.appmoduleabbrname.name", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "nfddw.deployjobwebhookappmodulevo.appmoduleid.name", type = ApiParamType.LONG)
    private Long appModuleId;

    public Long getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public String getAppModuleAbbrName() {
        return appModuleAbbrName;
    }

    public void setAppModuleAbbrName(String appModuleAbbrName) {
        this.appModuleAbbrName = appModuleAbbrName;
    }
}
