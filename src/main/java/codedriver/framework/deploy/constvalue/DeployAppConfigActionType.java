package codedriver.framework.deploy.constvalue;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvzk
 * @date 2022/05/24 4:16 下午
 */
public enum DeployAppConfigActionType {
    OPERATION("operation","操作"),
    SCENARIO("scenario","场景"),
    ENV("env","环境")
    ;

    private final String value;
    private final String text;

    DeployAppConfigActionType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static List<JSONObject> getValueTextList() {
        List<JSONObject> returnList = new ArrayList<>();
        for (DeployAppConfigActionType action : DeployAppConfigActionType.values()) {
            returnList.add(new JSONObject() {
                private static final long serialVersionUID = 1670544546905960015L;

                {
                    this.put("value", action.getValue());
                    this.put("text", action.getText());
                }
            });
        }
        return returnList;
    }
}
