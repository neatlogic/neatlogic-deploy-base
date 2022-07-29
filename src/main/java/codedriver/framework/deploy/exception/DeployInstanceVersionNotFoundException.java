package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployInstanceVersionNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 7632161527724040451L;

    public DeployInstanceVersionNotFoundException(Long instanceId) {
        super("没有找到实例：" + instanceId + "的当前版本");
    }
}
