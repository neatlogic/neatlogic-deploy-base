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
