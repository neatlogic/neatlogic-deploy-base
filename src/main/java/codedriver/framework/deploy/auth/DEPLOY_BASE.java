package codedriver.framework.deploy.auth;

import codedriver.framework.auth.core.AuthBase;

/**
 * @author longrf
 * @date 2022/3/23 10:52 上午
 */
public class DEPLOY_BASE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "发布基础权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "查看发布模块";
    }

    @Override
    public String getAuthGroup() {
        return "deploy";
    }

    @Override
    public Integer getSort() {
        return 1;
    }
}
