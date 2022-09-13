/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.constvalue;

import codedriver.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public enum DeployCiActionType implements IEnum {
    CREATE_JOB("create_job", "创建作业"),
    CREATE_BATCH_JOB("create_batch_job", "创建批量作业"),
    ;
    private final String value;
    private final String text;

    DeployCiActionType(String _value, String _text) {
        this.value = _value;
        this.text = _text;
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (DeployCiActionType type : values()) {
            JSONObject json = new JSONObject();
            json.put("value", type.getValue());
            json.put("text", type.getText());
            array.add(json);
        }
        return array;
    }

    public static DeployCiActionType getDeployCiActionType(String value) {
        for (DeployCiActionType type : DeployCiActionType.values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        return null;
    }

    public static String getDeployCiActionTypeText(String value) {
        for (DeployCiActionType type : DeployCiActionType.values()) {
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
