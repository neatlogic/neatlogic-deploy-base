/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class DeployAppEnvAutoConfigVo extends BaseEditorVo {
    private static final long serialVersionUID = -1948079785908118588L;
    @EntityField(name = "应用id", type = ApiParamType.LONG)
    private Long appId;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Long moduleId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "实例id", type = ApiParamType.LONG)
    private Long instanceId;

    @JSONField(serialize = false)
    private List<DeployAppEnvAutoConfigKeyValueVo> keyValueList;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public List<DeployAppEnvAutoConfigKeyValueVo> getKeyValueList() {
        return keyValueList;
    }

    public void setKeyValueList(List<DeployAppEnvAutoConfigKeyValueVo> keyValueList) {
        this.keyValueList = keyValueList;
    }
}
