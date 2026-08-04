/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.autoexec.source.IAutoexecJobSource;
import neatlogic.framework.util.$;

import java.util.Arrays;
import java.util.List;

/**
 * @author longrf
 * @date 2022/5/5 5:20 下午
 */
public enum JobSource implements IAutoexecJobSource {
    DEPLOY("nfdc.jobsource.text.deploy", "deploy"),
    BATCHDEPLOY("nfdc.jobsource.text.batchdeploy", "batchdeploy"),
    DEPLOY_SCHEDULE_GENERAL("nfdc.jobsource.text.deploy_schedule_general", "deployschedulegeneral"),
    DEPLOY_SCHEDULE_PIPELINE("nfdc.jobsource.text.deploy_schedule_pipeline", "deployschedulepipeline"),
    DEPLOY_CI("nfdc.jobsource.text.deploy_ci", "deployci"),
    DEPLOY_CI_PIPELINE("nfdc.jobsource.text.deploy_ci_pipeline", "deploycipipeline");
    private final String text;
    private final String value;

    JobSource(String _text, String _value) {
        this.text = _text;
        this.value = _value;
    }

    private static final List<String> batchJob = Arrays.asList(BATCHDEPLOY.getValue(),DEPLOY_SCHEDULE_PIPELINE.getValue(),DEPLOY_CI_PIPELINE.getValue());

    public String getValue() {
        return value;
    }

    public String getText() {
        return $.t(text);
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

    public static boolean isBatch(String source){
        return batchJob.contains(source);
    }

}
