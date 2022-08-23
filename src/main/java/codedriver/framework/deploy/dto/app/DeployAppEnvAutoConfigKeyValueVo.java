/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

public class DeployAppEnvAutoConfigKeyValueVo {
    @EntityField(name = "key", type = ApiParamType.LONG)
    private String key;
    @EntityField(name = "值", type = ApiParamType.LONG)
    private String value;

    public DeployAppEnvAutoConfigKeyValueVo() {
    }

    public DeployAppEnvAutoConfigKeyValueVo(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
