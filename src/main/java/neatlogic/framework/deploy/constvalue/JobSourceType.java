package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.util.$;

/**
 * @author lvzk
 * @date 2022/04/28 4:16 下午
 */
public enum JobSourceType {
    DEPLOY("deploy", "nfdc.jobsourcetype.text.deploy"),
    DEPLOY_VERSION_RESOURCE("deploy_version_resource", "nfdc.jobsourcetype.text.deploy_version_resource"),
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
        return $.t(text);
    }
}
