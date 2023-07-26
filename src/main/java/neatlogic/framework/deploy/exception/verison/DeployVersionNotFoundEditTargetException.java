package neatlogic.framework.deploy.exception.verison;

import neatlogic.framework.exception.core.NotFoundEditTargetException;

public class DeployVersionNotFoundEditTargetException extends NotFoundEditTargetException {
    private static final long serialVersionUID = -7486968237057414229L;

    public DeployVersionNotFoundEditTargetException(Long versionId) {
        super("nfdev.deployversionnotfoundedittargetexception.deployversionnotfoundedittargetexception", versionId);
    }
}
