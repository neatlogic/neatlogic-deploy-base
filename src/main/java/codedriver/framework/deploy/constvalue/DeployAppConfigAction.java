package codedriver.framework.deploy.constvalue;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author lvzk
 * @date 2022/05/24 4:16 下午
 */
public enum DeployAppConfigAction {
    VIEW("view","查看作业/配置"),
    EDIT("edit","编辑配置"),
    UPLOAD("productManager","制品管理"),
    VALIDATE("validate","验证")
    ;

    private final String value;
    private final String text;

    DeployAppConfigAction(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static JSONArray getValueTextList() {
        JSONArray array = new JSONArray();
        for (DeployAppConfigAction action : DeployAppConfigAction.values()) {
            array.add(new JSONObject() {
                private static final long serialVersionUID = 1670544546905960015L;

                {
                    this.put("value", action.getValue());
                    this.put("text", action.getText());
                }
            });
        }
        return array;
    }
}
