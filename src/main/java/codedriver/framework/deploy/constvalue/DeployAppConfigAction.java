package codedriver.framework.deploy.constvalue;

/**
 * @author lvzk
 * @date 2022/05/24 4:16 下午
 */
public enum DeployAppConfigAction {
    VIEW("view","查看作业/配置"),
    EDIT("edit","编辑配置"),
    UPLOAD("upload","上传"),
    VALIDATE("validate","验证")
    ;

    private final String value;
    private final String text;

    private DeployAppConfigAction(String value, String text) {
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
