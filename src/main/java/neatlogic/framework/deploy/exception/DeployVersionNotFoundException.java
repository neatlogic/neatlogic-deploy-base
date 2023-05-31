package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = -7486968237057414228L;

    public DeployVersionNotFoundException(Long versionId) {
        super("exception.deploy.deployversionnotfoundexception.a", versionId);
    }

    public DeployVersionNotFoundException(String version) {
        super("exception.deploy.deployversionnotfoundexception.a", version);
    }

    public DeployVersionNotFoundException(String sysName, String moduleName, String version) {
        super("exception.deploy.deployversionnotfoundexception.b", sysName, moduleName, version);
    }
}
