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

import java.util.Arrays;
import java.util.List;

/**
 * @author longrf
 * @date 2022/4/15 5:09 下午
 */
public class DEPLOY_MODIFY extends AuthBase {

    @Override
    public String getAuthDisplayName() {
        return "nfda.deploy_modify.getauthdisplayname";
    }

    @Override
    public String getAuthIntroduction() {
        return "nfda.deploy_modify.getauthintroduction";
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
        return Arrays.asList(BATCHDEPLOY_VERIFY.class, APP_CONFIG_MODIFY.class, DEPLOY_SCHEDULE_MODIFY.class);
    }
}
