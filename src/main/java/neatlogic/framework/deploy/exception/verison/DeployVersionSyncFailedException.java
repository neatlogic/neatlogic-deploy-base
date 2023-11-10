package neatlogic.framework.deploy.exception.verison;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class DeployVersionSyncFailedException extends ApiRuntimeException {
    public DeployVersionSyncFailedException(String msg) {
        super("nfdev.deployversionsyncfailedexception.deployversionsyncfailedexception", msg);
    }
}
