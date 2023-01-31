/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class DeployInstanceInEnvNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -3351840493487328267L;

    public DeployInstanceInEnvNotFoundException(String systemName, String moduleName, String envName, Long instanceId) {
        super(systemName + "->" + moduleName + "->" + envName + "下的实例：" + instanceId + "不存在");
    }

}
