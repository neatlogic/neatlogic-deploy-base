/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.deploy.constvalue;

import codedriver.framework.notify.core.INotifyTriggerType;

/**
 * @author longrf
 * @date 2022/12/29 11:36
 */

public enum DeployJobNotifyTriggerType implements INotifyTriggerType {

    FAILED("failed", "作业失败", "作业失败时触发通知"),
    ;

    private final String trigger;
    private final String text;
    private final String description;

    DeployJobNotifyTriggerType(String _trigger, String _text, String _description) {
        this.trigger = _trigger;
        this.text = _text;
        this.description = _description;
    }

    @Override
    public String getTrigger() {
        return trigger;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static String getText(String trigger) {
        for (DeployJobNotifyTriggerType n : values()) {
            if (n.getTrigger().equals(trigger)) {
                return n.getText();
            }
        }
        return "";
    }

    public static DeployJobNotifyTriggerType getTrigger(String trigger) {
        for (DeployJobNotifyTriggerType n : values()) {
            if (n.getTrigger().equals(trigger)) {
                return n;
            }
        }
        return null;
    }
}
