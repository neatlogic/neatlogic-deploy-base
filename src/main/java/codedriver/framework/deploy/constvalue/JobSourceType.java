package codedriver.framework.deploy.constvalue;

/**
 * @author lvzk
 * @date 2022/04/28 4:16 下午
 */
public enum JobSourceType {
    DEPLOY("deploy", "发布"),
    DEPLOY_VERSION_RESOURCE("deploy_version_resource", "版本中心制品"),
    ;

    private final String value;
    private final String text;

    JobSourceType(String value, String text) {
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
