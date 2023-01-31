package neatlogic.framework.deploy.exception;

import neatlogic.framework.deploy.dto.DeployPackageVo;
import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionParentDependencyNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 7241640577800154347L;

    public DeployVersionParentDependencyNotFoundException(DeployPackageVo packageVo) {
        super("父依赖：" + packageVo.getGroupId() + "->" + packageVo.getArtifactId() + "->" + packageVo.getVersion() + "不存在");
    }

}
