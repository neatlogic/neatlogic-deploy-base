/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.constvalue;

import codedriver.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public enum CiJobType implements IEnum {
    JOB("job", "作业"),
    BATCHJOB("batchjob", "批量作业"),
    ;
    private final String value;
    private final String text;

    CiJobType(String _value, String _text) {
        this.value = _value;
        this.text = _text;
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (CiJobType type : values()) {
            JSONObject json = new JSONObject();
            json.put("value", type.getValue());
            json.put("text", type.getText());
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


}
