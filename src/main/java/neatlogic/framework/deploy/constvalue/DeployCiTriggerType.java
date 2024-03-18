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
