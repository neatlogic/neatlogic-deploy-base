/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

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
        return text;
    }


}
