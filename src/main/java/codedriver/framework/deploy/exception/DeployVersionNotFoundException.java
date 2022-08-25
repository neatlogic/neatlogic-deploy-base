package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionNotFoundException extends ApiRuntimeException {
    public DeployVersionNotFoundException(Long versionId) {
        super("发布版本“" + versionId + "”不存在");
    }

    public DeployVersionNotFoundException(String version) {
        super("发布版本“" + version + "”不存在");
    }

    public DeployVersionNotFoundException(String sysName, String moduleName, String version) {
        super("发布 “" + sysName + "/" + moduleName + "/" + version + "” 不存在");
    }
}
