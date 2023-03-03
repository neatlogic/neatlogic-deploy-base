package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/7/20 9:55 上午
 */
public class DeploySqlJobPhaseNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 6378377750014002250L;

    public DeploySqlJobPhaseNotFoundException(String phaseName) {
        super("exception.deploy.deploysqljobphasenotfoundexception", phaseName);
    }
}