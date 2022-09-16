/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.auth;

import codedriver.framework.auth.core.AuthBase;

import java.util.Collections;
import java.util.List;

public class PIPELINE_MODIFY extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "超级流水线管理权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "创建、维护和删除超级流水线";
    }

    @Override
    public String getAuthGroup() {
        return "deploy";
    }

    @Override
    public Integer getSort() {
        return 5;
    }

    @Override
    public List<Class<? extends AuthBase>> getIncludeAuths() {
        return Collections.singletonList(DEPLOY_BASE.class);
    }
}
