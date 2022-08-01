/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.dto.AuthorityVo;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;
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

    @JSONField(serialize = false)
    List<String> authUuidList;

    @JSONField(serialize = false)
    List<String> actionList;

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

    public List<String> getAuthUuidList() {
        return authUuidList;
    }

    public void setAuthUuidList(List<String> authUuidList) {
        this.authUuidList = authUuidList;
    }

    public List<String> getActionList() {
        return actionList;
    }

    public void setActionList(List<String> actionList) {
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
