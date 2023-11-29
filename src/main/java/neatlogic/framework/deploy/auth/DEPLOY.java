package neatlogic.framework.deploy.auth;

import neatlogic.framework.auth.core.AuthBase;
import neatlogic.framework.cmdb.auth.label.CMDB;

import java.util.Collections;
import java.util.List;

/**
 * @author lvzk
 * @since  2023/11/29 10:52 上午
 */
public class DEPLOY extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "发布基础权限(接口)";
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

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Collections.singletonList(CMDB.class);
    }
}
