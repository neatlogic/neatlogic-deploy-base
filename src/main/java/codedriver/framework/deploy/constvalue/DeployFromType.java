package codedriver.framework.deploy.constvalue;

import codedriver.framework.dependency.core.IFromType;

/**
 * @author longrf
 * @date 2022/3/23 10:08 上午
 */
public enum DeployFromType  implements IFromType {
    DEPLOY_PROFILE_OPERATION("deployprofileoperation","自动化profile工具库工具和自定义工具");


    private String value;
    private String text;

    private DeployFromType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * 被调用者类型值
     *
     * @return
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * 被调用者类型名
     *
     * @return
     */
    @Override
    public String getText() {
        return text;
    }
}