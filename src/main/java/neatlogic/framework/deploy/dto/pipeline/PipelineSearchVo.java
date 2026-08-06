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

package neatlogic.framework.deploy.dto.pipeline;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;

public class PipelineSearchVo extends BasePageVo {
    @EntityField(name = "common.type", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "term.cmdb.appsystemid", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfddp.pipelinesearchvo.needverifyauth.name", type = ApiParamType.INTEGER)
    private Integer needVerifyAuth;
    @EntityField(name = "nfddp.pipelinesearchvo.ishasallauthority.name", type = ApiParamType.INTEGER)
    private Integer isHasAllAuthority;
    @EntityField(name = "nfddp.pipelinesearchvo.authuuid.name", type = ApiParamType.STRING)
    private String authUuid;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Integer getNeedVerifyAuth() {
        return needVerifyAuth;
    }

    public void setNeedVerifyAuth(Integer needVerifyAuth) {
        this.needVerifyAuth = needVerifyAuth;
    }

    public Integer getIsHasAllAuthority() {
        return isHasAllAuthority;
    }

    public void setIsHasAllAuthority(Integer isHasAllAuthority) {
        this.isHasAllAuthority = isHasAllAuthority;
    }

    public String getAuthUuid() {
        return authUuid;
    }

    public void setAuthUuid(String authUuid) {
        this.authUuid = authUuid;
    }
}
