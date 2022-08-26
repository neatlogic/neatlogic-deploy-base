/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

public class DeployAppConfigAuthorityActionVo {
    private static final long serialVersionUID = 3794860793315891800L;

    @EntityField(name = "授权操作", type = ApiParamType.STRING)
    private String action;
    @EntityField(name = "授权操作类型", type = ApiParamType.STRING)
    private String type;

    public DeployAppConfigAuthorityActionVo(String action, String type) {
        this.action = action;
        this.type = type;
    }

    public DeployAppConfigAuthorityActionVo() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeActionString() {
        return type + "#" + action;
    }
}
