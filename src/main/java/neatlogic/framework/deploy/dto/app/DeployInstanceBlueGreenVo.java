/*
 * Copyright (C) 2025  深圳极向量科技有限公司 All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployInstanceBlueGreenVo extends BaseEditorVo {
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "实例id", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "蓝绿id", type = ApiParamType.LONG)
    private Long blueGreenId;
    @EntityField(name = "蓝绿名", type = ApiParamType.STRING)
    private String blueGreenName;
    @EntityField(name = "蓝绿排序", type = ApiParamType.STRING)
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
