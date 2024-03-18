/*Copyright (C) 2023  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package neatlogic.framework.deploy.dto.app;

import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.dto.AuthorityVo;
import neatlogic.framework.restful.annotation.EntityField;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class DeployAppConfigAuthorityVo extends BaseEditorVo {
    private static final long serialVersionUID = -8106352774339841203L;
    @EntityField(name = "应用资产id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "环境资产id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "授权对象类型", type = ApiParamType.STRING)
    private String authType;
    @EntityField(name = "授权对象", type = ApiParamType.STRING)
    private String authUuid;
    @EntityField(name = "授权操作", type = ApiParamType.STRING)
    private String action;
    @EntityField(name = "授权操作类型", type = ApiParamType.STRING)
    private String authorityActionType;

    @JSONField(serialize = false)
    List<String> authUuidList;

    @JSONField(serialize = false)
    List<DeployAppConfigAuthorityActionVo> actionList;

    @JSONField(serialize = false)
    List<Long> envIdList;

    @JSONField(serialize = false)
    private List<AuthorityVo> authorityList;

    @JSONField(serialize = false)
    private List<String> authorityStrList;

    @JSONField(serialize = false)
    private Integer isEdit;

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthUuid() {
        return authUuid;
    }

    public void setAuthUuid(String authUuid) {
        this.authUuid = authUuid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAuthorityActionType() {
        return authorityActionType;
    }

    public void setAuthorityActionType(String authorityActionType) {
        this.authorityActionType = authorityActionType;
    }

    public List<String> getAuthUuidList() {
        if (CollectionUtils.isEmpty(authUuidList) && CollectionUtils.isNotEmpty(getAuthorityList())) {
            authUuidList = new ArrayList<>();
            for (AuthorityVo authorityVo : getAuthorityList()) {
                authUuidList.add(authorityVo.getUuid());
            }
        }
        return authUuidList;
    }

    public void setAuthUuidList(List<String> authUuidList) {
        this.authUuidList = authUuidList;
    }

    public List<DeployAppConfigAuthorityActionVo> getActionList() {
        return actionList;
    }

    public void setActionList(List<DeployAppConfigAuthorityActionVo> actionList) {
        this.actionList = actionList;
    }

    public List<Long> getEnvIdList() {
        return envIdList;
    }

    public void setEnvIdList(List<Long> envIdList) {
        this.envIdList = envIdList;
    }

    public List<AuthorityVo> getAuthorityList() {
        if (CollectionUtils.isEmpty(authorityList) && CollectionUtils.isNotEmpty(authorityStrList)) {
            authorityList = new ArrayList<>();
            for (String authorityStr : authorityStrList) {
                String[] authorityArray = authorityStr.split("#");
                authorityList.add(new AuthorityVo(authorityArray[0], authorityArray[1]));
            }
        }
        return authorityList;
    }

    public List<String> getAuthorityStrList() {
        return authorityStrList;
    }

    public void setAuthorityStrList(List<String> authorityStrList) {
        this.authorityStrList = authorityStrList;
    }

    public void setAuthorityList(List<AuthorityVo> authorityList) {
        this.authorityList = authorityList;
    }

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }
}
