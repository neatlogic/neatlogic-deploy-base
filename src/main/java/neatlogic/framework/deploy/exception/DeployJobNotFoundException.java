package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployJobNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -857892516459228779L;

    public DeployJobNotFoundException(String appSystemName, String appModuleName) {
        super("{0}下的{1}模块尚未执行过任何作业", appSystemName, appModuleName);
    }

}
