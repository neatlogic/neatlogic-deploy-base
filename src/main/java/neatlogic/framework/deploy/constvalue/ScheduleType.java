/*
Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. 
 */

package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.util.I18nUtils;

import java.util.List;
import java.util.Objects;

public enum ScheduleType implements IEnum {
    GENERAL("general", "enum.deploy.scheduletype.general"),
    PIPELINE("pipeline", "enum.deploy.scheduletype.pipeline");

    ScheduleType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    private String value;
    private String text;

    @Override
    public String getValue() {
        return value;
    }

    public String getText() {
        return I18nUtils.getMessage(text);
    }

    public static String getText(String value) {
        for (ScheduleType e : values()) {
            if (Objects.equals(e.getValue(), value)) {
                return e.getText();
            }
        }
        return "";
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (ScheduleType e : values()) {
            array.add(new JSONObject() {
                {
                    this.put("value", e.getValue());
                    this.put("text", e.getText());
                }
            });
        }
        return array;
    }
}
