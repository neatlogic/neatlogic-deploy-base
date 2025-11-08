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

public enum DeployCiAuditStatus implements IEnum {
    SUCCEED("succeed", "成功"),
    FAILED("failed", "失败"),
    IGNORED("ignored", "已忽略");
    private final String value;
    private final String text;

    DeployCiAuditStatus(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return $.t(text);
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (DeployCiAuditStatus type : values()) {
            array.add(new JSONObject() {
                {
                    this.put("value", type.getValue());
                    this.put("text", type.getText());
                }
            });
        }
        return array;
    }

    public static String getText(String value) {
        for (DeployCiAuditStatus status : DeployCiAuditStatus.values()) {
            if (status.getValue().equals(value)) {
                return status.getText();
            }
        }
        return null;
    }
    
}
