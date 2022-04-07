/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.auth;

import codedriver.framework.auth.core.AuthBase;

import java.util.Collections;
import java.util.List;

public class DEPLOY_PINELINE_TEMPLATE_MANAGE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "流水线模板管理权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "流水线模板的添加、修改、删除、查看操作";
    }

    @Override
    public String getAuthGroup() {
        return "deploy";
    }

    @Override
    public Integer getSort() {
        return 3;
    }

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Collections.singletonList(DEPLOY_BASE.class);
    }
}
