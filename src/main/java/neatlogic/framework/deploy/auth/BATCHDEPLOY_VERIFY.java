/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

package neatlogic.framework.deploy.auth;

import neatlogic.framework.auth.core.AuthBase;

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
