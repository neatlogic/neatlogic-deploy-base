package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployInstanceVersionNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 7632161527724040451L;

    public DeployInstanceVersionNotFoundException(Long instanceId) {
        super("没有找到实例：{0}的当前版本", instanceId);
    }
}
