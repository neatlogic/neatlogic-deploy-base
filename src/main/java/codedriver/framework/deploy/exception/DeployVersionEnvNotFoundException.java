package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionEnvNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = -1562312611391613513L;

    public DeployVersionEnvNotFoundException(String versionName, Long envId) {
        super("版本“" + versionName + "”的" + envId + "环境不存在");
    }
}