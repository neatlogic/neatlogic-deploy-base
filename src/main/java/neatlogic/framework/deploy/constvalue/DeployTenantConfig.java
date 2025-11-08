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

package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.config.ITenantConfig;
import neatlogic.framework.util.$;

public enum DeployTenantConfig implements ITenantConfig {
    GITLAB_WEB_HOOK_CALLBACK_HOST("gitlabWebHookCallbackHost", null, "nfdc.deploytenantconfig.gitlabwebhookcallbackhost"),
    ;

    String key;
    String value;
    String description;

    DeployTenantConfig(String key, String value, String description) {
        this.key = key;
        this.value = value;
        this.description = description;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getDescription() {
        return $.t(description);
    }
}
