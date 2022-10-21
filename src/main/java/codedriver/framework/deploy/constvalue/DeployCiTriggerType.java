/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.constvalue;

import codedriver.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public enum DeployCiTriggerType implements IEnum {
    MANUAL("manual", "手动触发","立即自动创建作业，手动触发作业"),
    AUTO("auto", "自动触发","立即自动创建作业，指定时间自动触发"),
    INSTANT("instant", "立即触发","立即自动创建作业，立即触发"),
    DELAY("delay", "延迟触发","立即自动创建作业，n秒内相同的集成触发将被忽略(不触发创建作业)")
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
        return text;
    }

    public String getDescription() {
        return description;
    }
}
