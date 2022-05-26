/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class DeployAppEnvAutoConfigVo {
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "实例id", type = ApiParamType.LONG)
    private Long instanceId;

    @JSONField(serialize = false)
    private List<DeployAppEnvAutoConfigKeyValueVo> keyValueList;

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
