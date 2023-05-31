package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.util.I18nUtils;

/**
 * @author lvzk
 * @date 2022/04/28 4:16 下午
 */
public enum JobSourceType {
    DEPLOY("deploy", "common.deploy.a"),
    DEPLOY_VERSION_RESOURCE("deploy_version_resource", "enum.deploy.jobsourcetype.deploy_version_resource"),
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
        return I18nUtils.getMessage(text);
    }
}
