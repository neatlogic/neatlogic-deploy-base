package codedriver.framework.deploy.auth;

import codedriver.framework.auth.core.AuthBase;

import java.util.Collections;
import java.util.List;

/**
 * @author longrf
 * @date 2022/4/15 5:09 下午
 */
public class DEPLOY_MODIFY extends AuthBase {

    @Override
    public String getAuthDisplayName() {
        return "自动发布管理员权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "自动发布全局参数管理、场景定义";
    }

    @Override
    public String getAuthGroup() {
        return "deploy";
    }

    @Override
    public Integer getSort() {
        return 4;
    }

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Collections.singletonList(BATCHDEPLOY_VERIFY.class);
    }
}
