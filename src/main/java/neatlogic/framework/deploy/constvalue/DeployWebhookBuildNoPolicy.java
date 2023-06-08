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

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.IEnum;
import neatlogic.framework.util.$;

import java.util.List;

public enum DeployWebhookBuildNoPolicy implements IEnum {
    THE_SAME("the_same", "与原作业一致"),
    NEW("new", "新建buildNo")
    ;
    private final String value;
    private final String text;

    DeployWebhookBuildNoPolicy(String _value, String _text) {
        this.value = _value;
        this.text = _text;
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (DeployWebhookBuildNoPolicy type : values()) {
            JSONObject json = new JSONObject();
            json.put("value", type.getValue());
            json.put("text", type.getText());
            array.add(json);
        }
        return array;
    }

    public static DeployWebhookBuildNoPolicy getDeployTriggerBuildNoPolicy(String value) {
        for (DeployWebhookBuildNoPolicy type : DeployWebhookBuildNoPolicy.values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        return null;
    }

    public static String getDeployTriggerBuildNoPolicyText(String value) {
        for (DeployWebhookBuildNoPolicy type : DeployWebhookBuildNoPolicy.values()) {
            if (type.getValue().equals(value)) {
                return type.getText();
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return $.t(text);
    }


}
