/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class DeployAppModuleEnvInstanceNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 8025596450720197831L;

    public DeployAppModuleEnvInstanceNotFoundException(String sysName, String moduleName, String envName) {
        super("发布 “" + sysName + "/" + moduleName + "/" + envName + "” 找不到节点");
    }
}
