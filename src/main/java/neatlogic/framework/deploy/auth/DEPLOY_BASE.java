package neatlogic.framework.deploy.auth;

import neatlogic.framework.auth.core.AuthBase;
import neatlogic.framework.cmdb.auth.label.CMDB;

import java.util.Collections;
import java.util.List;

/**
 * @author longrf
 * @date 2022/3/23 10:52 上午
 */
public class DEPLOY_BASE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "auth.deploy.deploybase.name";
    }

    @Override
    public String getAuthIntroduction() {
        return "auth.deploy.deploybase.introduction";
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
