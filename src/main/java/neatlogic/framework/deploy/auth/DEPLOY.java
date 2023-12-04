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
        return "nfda.deploy.getauthdisplayname";
    }

    @Override
    public String getAuthIntroduction() {
        return "nfda.deploy.getauthintroduction";
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

    @Override
    public boolean isShow() {
        return false;
    }
}
