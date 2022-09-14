/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.constvalue;

import codedriver.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Objects;

public enum ScheduleType implements IEnum {
    GENERAL("general", "普通作业"),
    PIPELINE("pipeline", "超级流水线");

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
        return text;
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
