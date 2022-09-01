/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class DeployAppConfigNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -977868275722986124L;

    public DeployAppConfigNotFoundException(Long id) {
        super("应用”" + id + "“的流水线不存在");
    }
}
