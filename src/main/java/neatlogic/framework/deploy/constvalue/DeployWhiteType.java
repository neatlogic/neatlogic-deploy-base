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
package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

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
        return text;
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