/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
