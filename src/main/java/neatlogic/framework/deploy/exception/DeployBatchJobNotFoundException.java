package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/04 9:55 上午
 */
public class DeployBatchJobNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 3138988475130730714L;

    public DeployBatchJobNotFoundException(Long id) {
        super("nfde.deploybatchjobnotfoundexception.deploybatchjobnotfoundexception", id);
    }

    public DeployBatchJobNotFoundException() {
        super("nfde.deploybatchjobnotfoundexception.b");
    }
}
