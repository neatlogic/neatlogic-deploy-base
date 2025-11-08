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

package neatlogic.framework.deploy.dto.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeployProfileVo implements Serializable {

    private Long profileId;
    private String profileName;
    private List<DeployProfileParamVo> paramList;

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public List<DeployProfileParamVo> getParamList() {
        if (paramList == null) {
            paramList = new ArrayList<>();
        }
        return paramList;
    }

    public void setParamList(List<DeployProfileParamVo> paramList) {
        this.paramList = paramList;
    }
}
