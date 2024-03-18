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

package neatlogic.framework.deploy.auth;

import neatlogic.framework.auth.core.AuthBase;

public class APP_CONFIG_MODIFY_SHARE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "nfda.app_config_modify_share.getauthdisplayname";
    }

    @Override
    public String getAuthIntroduction() {
        return "nfda.app_config_modify_share.getauthintroduction";
    }

    @Override
    public String getAuthGroup() {
        return "deploy";
    }

    @Override
    public Integer getSort() {
        return 6;
    }

    @Override
    public boolean isShow() {
        return false;
    }

}
