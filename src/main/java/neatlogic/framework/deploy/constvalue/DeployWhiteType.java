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

    START_STOP( "START_STOP", "nfdc.deploywhitetype.text.start_stop"),
    NATIVE( "NATIVE", "nfdc.deploywhitetype.text.native"),
    BASIC("BASIC", "nfdc.deploywhitetype.text.basic"),
    BUILD("BUILD", "nfdc.deploywhitetype.text.build"),
    DEPLOY( "DEPLOY", "nfdc.deploywhitetype.text.deploy"),
    SQL_FILE("SQL_FILE", "nfdc.deploywhitetype.text.sql_file"),
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
