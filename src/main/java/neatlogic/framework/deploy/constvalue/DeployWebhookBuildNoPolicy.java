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

import java.util.List;

public enum DeployWebhookBuildNoPolicy implements IEnum {
    THE_SAME("the_same", "nfdc.deploywebhookbuildnopolicy.text.the_same"),
    NEW("new", "nfdc.deploywebhookbuildnopolicy.text.new")
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
