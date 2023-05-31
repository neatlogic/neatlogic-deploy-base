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
import neatlogic.framework.util.I18nUtils;

import java.util.List;

public enum DeployCiTriggerType implements IEnum {
    MANUAL("manual", "enum.deploy.deploycitriggertype.manual.a","enum.deploy.deploycitriggertype.manual.b"),
    AUTO("auto", "enum.deploy.deploycitriggertype.auto.a","enum.deploy.deploycitriggertype.auto.b"),
    INSTANT("instant", "enum.deploy.deploycitriggertype.instant.a","enum.deploy.deploycitriggertype.instant.b"),
    DELAY("delay", "enum.deploy.deploycitriggertype.delay.a","enum.deploy.deploycitriggertype.delay.b")
    ;
    private final String value;
    private final String text;
    private final String description;

    DeployCiTriggerType(String _value, String _text,String _description) {
        this.value = _value;
        this.text = _text;
        this.description = _description;
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (DeployCiTriggerType type : values()) {
            JSONObject json = new JSONObject();
            json.put("value", type.getValue());
            json.put("text", type.getText());
            json.put("description", type.getDescription());
            array.add(json);
        }
        return array;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return I18nUtils.getMessage(text);
    }

    public String getDescription() {
        return I18nUtils.getMessage(description);
    }
}
