/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.constvalue;

import codedriver.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public enum PipelineType implements IEnum {
    APPSYSTEM("appsystem", "应用流水线"),
    GLOBAL("global", "全局流水线");

    PipelineType(String value, String text) {
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
        for (PipelineType e : values()) {
            if (e.value.equals(value)) {
                return e.text;
            }
        }
        return "";
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (PipelineType type : values()) {
            array.add(new JSONObject() {
                {
                    this.put("value", type.getValue());
                    this.put("text", type.getText());
                }
            });
        }
        return array;
    }
}
