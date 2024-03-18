/*Copyright (C) 2024  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

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
