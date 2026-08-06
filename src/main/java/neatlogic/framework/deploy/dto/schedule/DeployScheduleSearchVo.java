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

package neatlogic.framework.deploy.dto.schedule;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployScheduleSearchVo extends BasePageVo {
    @EntityField(name = "nfdds.deployschedulesearchvo.isactive.name", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "term.cmdb.appsystemid", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "term.cmdb.appmoduleid", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "nfdds.deployschedulesearchvo.ishasallauthority.name", type = ApiParamType.INTEGER)
    private Integer isHasAllAuthority;
    @EntityField(name = "nfdds.deployschedulesearchvo.authorityactionlist.name", type = ApiParamType.JSONARRAY)
    List<String> authorityActionList;
    @EntityField(name = "nfdds.deployschedulesearchvo.authuuidlist.name", type = ApiParamType.JSONARRAY)
    private List<String> authUuidList;

    private String sourceServerGroup;

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
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

    public Integer getIsHasAllAuthority() {
        return isHasAllAuthority;
    }

    public void setIsHasAllAuthority(Integer isHasAllAuthority) {
        this.isHasAllAuthority = isHasAllAuthority;
    }

    public List<String> getAuthorityActionList() {
        return authorityActionList;
    }

    public void setAuthorityActionList(List<String> authorityActionList) {
        this.authorityActionList = authorityActionList;
    }

    public List<String> getAuthUuidList() {
        return authUuidList;
    }

    public void setAuthUuidList(List<String> authUuidList) {
        this.authUuidList = authUuidList;
    }

    public String getSourceServerGroup() {
        return sourceServerGroup;
    }

    public void setSourceServerGroup(String sourceServerGroup) {
        this.sourceServerGroup = sourceServerGroup;
    }
}
