/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.deploy.constvalue;

import codedriver.framework.autoexec.type.IAutoexecType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author longrf
 * @date 2022/12/14 14:21
 */

public enum AutoexecType implements IAutoexecType {

    BUILD(9L, "BUILD", "编译打包"),
    BIZ_JOBS(10L, "BIZ_JOBS", "作业调度"),
    DEPLOY(11L, "DEPLOY", "自动发布");

    private final Long id;
    private final String value;
    private final String text;

    AutoexecType(Long id, String _value, String _text) {
        this.id = id;
        this.value = _value;
        this.text = _text;
    }

    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    @Override
    public JSONArray getValueTextList() {
        JSONArray array = new JSONArray();
        for (AutoexecType s : values()) {
            JSONObject json = new JSONObject();
            json.put("id", s.getId());
            json.put("value", s.getValue());
            json.put("text", s.getText());
            array.add(json);
        }
        return array;
    }
}
