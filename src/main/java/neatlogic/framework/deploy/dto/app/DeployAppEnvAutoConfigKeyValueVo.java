/*Copyright (C) 2023  深圳极向量科技有限公司 All Rights Reserved.

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

import neatlogic.framework.autoexec.constvalue.ParamType;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.util.RC4Util;
import neatlogic.framework.restful.annotation.EntityField;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class DeployAppEnvAutoConfigKeyValueVo {
    @EntityField(name = "common.key", type = ApiParamType.LONG)
    private String key;

    @EntityField(name = "common.type", type = ApiParamType.LONG)
    private String type;
    @EntityField(name = "common.value", type = ApiParamType.LONG)
    private String value;

    public DeployAppEnvAutoConfigKeyValueVo() {
    }

    public DeployAppEnvAutoConfigKeyValueVo(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        if(StringUtils.isNotBlank(getType())&& Objects.equals(getType(),ParamType.PASSWORD.getValue())){
            return RC4Util.encrypt(value);
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeText() {
        if (StringUtils.isNotBlank(this.type)) {
            ParamType paramType = ParamType.getParamType(type);
            if (paramType != null) {
                return paramType.getText();
            }
        }
        return StringUtils.EMPTY;
    }

}
