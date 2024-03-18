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
package neatlogic.framework.deploy.constvalue;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.IEnum;
import neatlogic.framework.util.$;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longrf
 * @date 2022/12/13 15:49
 */

public enum DeployWhiteType implements IEnum {

    START_STOP( "START_STOP", "启停操作"),
    NATIVE( "NATIVE", "调度器内置工具"),
    BASIC("BASIC", "基础工具"),
    BUILD("BUILD", "编译打包"),
    DEPLOY( "DEPLOY", "自动发布"),
    SQL_FILE("SQL_FILE", "SQL处理"),
    ;


    private final String value;
    private final String text;

    DeployWhiteType(String _value, String _text) {
        this.value = _value;
        this.text = _text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return $.t(text);
    }

    @Override
    public JSONArray getValueTextList() {
        JSONArray array = new JSONArray();
        for (DeployWhiteType s : values()) {
            JSONObject json = new JSONObject();
            json.put("value", s.getValue());
            json.put("text", s.getText());
            array.add(json);
        }
        return array;
    }

    public static List<String> getValueList() {
        List<String> returnList = new ArrayList<>();
        for (DeployWhiteType action : DeployWhiteType.values()) {
            returnList.add(action.getValue());
        }
        return returnList;
    }
}
