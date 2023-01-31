/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class DeployGitlabWebHookCallbackHostLostException extends ApiRuntimeException {
    public DeployGitlabWebHookCallbackHostLostException() {
        super("缺失初始化配置“gitlabWebHookCallbackHost“，请联系管理员处理");
    }
}
