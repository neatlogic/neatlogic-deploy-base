package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployJobNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -857892516459228779L;

    public DeployJobNotFoundException(String appSystemName, String appModuleName) {
        super("exception.deploy.deployjobnotfoundexception", appSystemName, appModuleName);
    }

}
