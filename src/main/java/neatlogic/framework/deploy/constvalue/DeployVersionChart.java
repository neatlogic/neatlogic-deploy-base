package neatlogic.framework.deploy.constvalue;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.IEnum;
import neatlogic.framework.util.$;

import java.util.List;

public enum DeployVersionChart implements IEnum {
    CODE_SCAN("code_scan", "代码扫描"),
    UNIT_TEST("unit_test", "单元测试"),
    ;

    private final String value;
    private final String text;

    DeployVersionChart(String value, String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (DeployVersionChart menu : DeployVersionChart.values()) {
            array.add(new JSONObject() {
                {
                    this.put("value", menu.getValue());
                    this.put("text", menu.getText());
                }
            });
        }
        return array;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return $.t(text);
    }
}
