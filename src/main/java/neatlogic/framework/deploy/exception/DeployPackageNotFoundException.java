package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployPackageNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -3746048570994740846L;

    public DeployPackageNotFoundException(String groupId, String artifactId, String version) {
        super("依赖包：" + groupId + "->" + artifactId + "->" + version + "不存在");
    }

}
