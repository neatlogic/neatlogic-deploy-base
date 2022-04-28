package codedriver.framework.deploy.constvalue;

/**
 * @author lvzk
 * @date 2022/04/28 4:16 下午
 */
public enum DeployOperType {
    DEPLOY("deploy","发布");

    private final String value;
    private final String text;

    private DeployOperType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
