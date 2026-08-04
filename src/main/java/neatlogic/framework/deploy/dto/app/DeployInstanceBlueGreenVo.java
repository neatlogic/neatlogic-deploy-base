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
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployInstanceBlueGreenVo extends BaseEditorVo {
    @EntityField(name = "nfdda.deployinstancebluegreenvo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfdda.deployinstancebluegreenvo.appmoduleid.name", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "nfdda.deployinstancebluegreenvo.envid.name", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "nfdda.deployinstancebluegreenvo.resourceid.name", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "nfdda.deployinstancebluegreenvo.bluegreenid.name", type = ApiParamType.LONG)
    private Long blueGreenId;
    @EntityField(name = "nfdda.deployinstancebluegreenvo.bluegreenname.name", type = ApiParamType.STRING)
    private String blueGreenName;
    @EntityField(name = "nfdda.deployinstancebluegreenvo.bluegreensort.name", type = ApiParamType.STRING)
    private String blueGreenSort;

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

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getBlueGreenId() {
        return blueGreenId;
    }

    public void setBlueGreenId(Long blueGreenId) {
        this.blueGreenId = blueGreenId;
    }

    public String getBlueGreenName() {
        return blueGreenName;
    }

    public void setBlueGreenName(String blueGreenName) {
        this.blueGreenName = blueGreenName;
    }

    public String getBlueGreenSort() {
        return blueGreenSort;
    }

    public void setBlueGreenSort(String blueGreenSort) {
        this.blueGreenSort = blueGreenSort;
    }
}
