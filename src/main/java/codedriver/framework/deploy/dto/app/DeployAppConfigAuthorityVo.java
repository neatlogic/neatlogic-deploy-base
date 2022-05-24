/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class DeployAppConfigAuthorityVo extends BasePageVo {
    private static final long serialVersionUID = -8106352774339841203L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "应用资产id", type = ApiParamType.LONG)
    private Long appResourceId;
    @EntityField(name = "环境资产id", type = ApiParamType.LONG)
    private Long envResourceId;
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
    List<Long> envResourceIdList;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppResourceId() {
        return appResourceId;
    }

    public void setAppResourceId(Long appResourceId) {
        this.appResourceId = appResourceId;
    }

    public Long getEnvResourceId() {
        return envResourceId;
    }

    public void setEnvResourceId(Long envResourceId) {
        this.envResourceId = envResourceId;
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

    public List<Long> getEnvResourceIdList() {
        return envResourceIdList;
    }

    public void setEnvResourceIdList(List<Long> envResourceIdList) {
        this.envResourceIdList = envResourceIdList;
    }
}
