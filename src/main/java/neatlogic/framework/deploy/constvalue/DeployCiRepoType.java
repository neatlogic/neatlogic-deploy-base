/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public enum DeployCiRepoType implements IEnum {
    GITLAB("gitlab"),
    SVN("svn"),
    ;
    private final String value;

    DeployCiRepoType(String _value) {
        this.value = _value;
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (DeployCiRepoType type : values()) {
            JSONObject json = new JSONObject();
            json.put("value", type.getValue());
            json.put("text", type.getValue());
            array.add(json);
        }
        return array;
    }

    public String getValue() {
        return value;
    }


}
