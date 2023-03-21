package neatlogic.framework.deploy.constvalue;

import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.util.I18nUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvzk
 * @date 2022/05/24 4:16 下午
 */
public enum DeployAppConfigAction {
    VIEW("view","enum.deploy.deployappconfigaction.view"),
    EDIT("edit","enum.deploy.deployappconfigaction.edit"),
    VERSION_AND_PRODUCT_MANAGER("versionAndProductManager","enum.deploy.deployappconfigaction.version_and_product_manager"),
    PIPELINE("pipeline","enum.deploy.deployappconfigaction.pipeline"),
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
        return I18nUtils.getMessage(text);
    }

    public static List<JSONObject> getValueTextList() {
        List<JSONObject> returnList = new ArrayList<>();
        for (DeployAppConfigAction action : DeployAppConfigAction.values()) {
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

    public static List<String> getValueList() {
        List<String> returnList = new ArrayList<>();
        for (DeployAppConfigAction action : DeployAppConfigAction.values()) {
            returnList.add(action.getValue());
        }
        return returnList;
    }
}
