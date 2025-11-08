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

package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployVersionCvePackageVo {
    @EntityField(name = "common.id", type = ApiParamType.LONG)
    private Long cveId;
    @EntityField(name = "common.packagename", type = ApiParamType.STRING)
    private String packageName;
    @EntityField(name = "term.deploy.packageurl", type = ApiParamType.STRING)
    private String url;

    public Long getCveId() {
        return cveId;
    }

    public void setCveId(Long cveId) {
        this.cveId = cveId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
