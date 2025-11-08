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
        return $.t(text);
    }

    public String getDescription() {
        return $.t(description);
    }
}
