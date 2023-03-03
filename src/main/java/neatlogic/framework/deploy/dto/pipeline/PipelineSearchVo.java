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

package neatlogic.framework.deploy.dto.pipeline;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;

public class PipelineSearchVo extends BasePageVo {
    @EntityField(name = "类型", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "应用ID", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "是否需要验证权限", type = ApiParamType.INTEGER)
    private Integer needVerifyAuth;
    @EntityField(name = "是否拥有所有权限", type = ApiParamType.INTEGER)
    private Integer isHasAllAuthority;
    @EntityField(name = "用户uuid", type = ApiParamType.STRING)
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
