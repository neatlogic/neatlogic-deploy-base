/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;
import org.apache.commons.lang3.StringUtils;

public class DeployAppConfigModuleRunnerGroupNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 6333597401986892305L;

    public DeployAppConfigModuleRunnerGroupNotFoundException(String appSystem, String systemModule) {
        super("应用系统 '" + (StringUtils.isBlank(appSystem) ? StringUtils.EMPTY : appSystem) + "',模块'" + (StringUtils.isBlank(systemModule) ? StringUtils.EMPTY : systemModule) + "'没有配置runner组");
    }
}
