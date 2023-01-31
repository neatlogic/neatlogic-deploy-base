/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.constvalue;

/**
 * 组合工具操作类型
 **/
public enum CombopOperationType {
    PIPELINE("pipeline", "发布流水线");

    CombopOperationType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    private final String value;
    private final String text;

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static String getText(String name) {
        for (CombopOperationType s : CombopOperationType.values()) {
            if (s.getValue().equals(name)) {
                return s.getText();
            }
        }
        return "";
    }
}
