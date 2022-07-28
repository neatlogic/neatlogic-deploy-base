/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.auth;

import codedriver.framework.auth.core.AuthBase;

import java.util.Collections;
import java.util.List;

/**
 * @author longrf
 * @date 2022/3/23 10:52 上午
 */
public class BATCHDEPLOY_VERIFY extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "批量发布审核权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "审核待审核的批量发布作业，拥有此权限的用户创建的作业自动通过审核";
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
        return Collections.singletonList(BATCHDEPLOY_MODIFY.class);
    }
}
