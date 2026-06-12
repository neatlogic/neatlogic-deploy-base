package neatlogic.framework.deploy.exception;

import neatlogic.framework.deploy.dto.job.DeployJobModuleVo;
import neatlogic.framework.deploy.dto.job.DeployJobVo;
import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = -7486968237057414228L;

    public DeployVersionNotFoundException(Long versionId) {
        super("发布版本“{0}”不存在", versionId);
    }

    public DeployVersionNotFoundException(String version) {
        super("发布版本“{0}”不存在", version);
    }

    public DeployVersionNotFoundException(String sysName, String moduleName, String version) {
        super("发布 “{0}/{1}/{2}” 不存在", sysName, moduleName, version);
    }

    public DeployVersionNotFoundException(DeployJobVo deployJobParam, String from) {
        super("发布版本 “{6}-{0}({1})/{2}({3})/{4}({5})” 不存在", deployJobParam.getAppSystemAbbrName(), deployJobParam.getAppSystemId(), deployJobParam.getAppModuleName(), deployJobParam.getAppModuleId(), deployJobParam.getVersion(), deployJobParam.getVersionId(), from);
    }

    public DeployVersionNotFoundException(DeployJobVo deployJobParam, DeployJobModuleVo moduleVo, String from) {
        super("发布版本 “{6}-{0}({1})/{2}({3})/{4}({5})” 不存在", deployJobParam.getAppSystemAbbrName(), deployJobParam.getAppSystemId(), deployJobParam.getAppModuleName(), deployJobParam.getAppModuleId(), moduleVo.getVersion(), deployJobParam.getVersionId(), from);
    }
}
