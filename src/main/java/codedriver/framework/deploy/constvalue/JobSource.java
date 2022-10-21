/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.constvalue;

import codedriver.framework.autoexec.dto.AutoexecJobSourceVo;
import codedriver.framework.autoexec.source.IAutoexecJobSource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longrf
 * @date 2022/5/5 5:20 下午
 */
public enum JobSource implements IAutoexecJobSource {
    DEPLOY("一键发布", "deploy"),
    BATCHDEPLOY("批量发布", "batchdeploy"),
    DEPLOY_SCHEDULE_GENERAL("发布定时普通作业", "deployschedulegeneral"),
    DEPLOY_SCHEDULE_PIPELINE("发布定时超级流水线", "deployschedulepipeline"),
    PIPELINE("发布超级流水线", "pipeline"),
    DEPLOY_CI("发布持续集成", "deployci");
    private final String text;
    private final String value;

    JobSource(String _text, String _value) {
        this.text = _text;
        this.value = _value;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static String getText(String _status) {
        for (JobSource s : JobSource.values()) {
            if (s.getValue().equals(_status)) {
                return s.getText();
            }
        }
        return "";
    }

    @Override
    public String getType() {
        return JobSourceType.DEPLOY.getValue();
    }

    /**
     * @return 返回对应的来源
     */
    @Override
    public List<AutoexecJobSourceVo> getSource() {
        List<AutoexecJobSourceVo> list = new ArrayList<>();
        for (JobSource s : JobSource.values()) {
            AutoexecJobSourceVo source = new AutoexecJobSourceVo();
            source.setSource(s.value);
            source.setSourceName(s.text);
            source.setType(s.getType());
            list.add(source);
        }
        return list;
    }

}
