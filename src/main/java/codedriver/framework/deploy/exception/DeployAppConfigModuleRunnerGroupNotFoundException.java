/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class DeployAppConfigModuleRunnerGroupNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 6333597401986892305L;

    public  DeployAppConfigModuleRunnerGroupNotFoundException(Long appSystemId, Long systemModuleId){
        super("应用系统 '"+appSystemId+"',模块'"+systemModuleId+"'没有配置runner组");
    }
}
