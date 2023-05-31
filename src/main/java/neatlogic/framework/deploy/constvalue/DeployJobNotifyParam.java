package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.common.constvalue.ParamType;
import neatlogic.framework.notify.core.INotifyParam;
import neatlogic.framework.util.I18nUtils;

/**
 * @author longrf
 * @date 2022/12/29 10:24
 */

public enum DeployJobNotifyParam implements INotifyParam {
    APPSYSTEMNAMEANDABBRNAME("appSystemNameAndAbbrName", "common.app", ParamType.STRING),
    APPMODULENAMEANDABBRNAME("appModuleNameAndAbbrName", "enum.deploy.deployjobnotifyparam.appmodulenameandabbrname", ParamType.STRING),
    ENVNAME("envName", "common.environment", ParamType.STRING),
    VERSION("version", "enum.deploy.deployjobnotifyparam.version", ParamType.STRING),
    SCENARIONAME("scenarioName", "common.scene", ParamType.STRING),
    JOBID("deployJobId", "common.jobid", ParamType.NUMBER),
    JOBNAME("deployJobName", "common.jobname", ParamType.STRING),
    JOBSTATUS("deployJobStatus", "common.jobstatus", ParamType.STRING),
    JOBPHASELIST("deployJobPhaseList", "common.phaselist", ParamType.ARRAY),
    TRIGGERTYPENAME("deployTriggerTypeName", "enum.deploy.deployjobnotifyparam.triggertypename", ParamType.STRING),
    ;
    private final String value;
    private final String text;
    private final ParamType paramType;

    DeployJobNotifyParam(String value, String text, ParamType paramType) {
        this.value = value;
        this.text = text;
        this.paramType = paramType;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getText() {
        return I18nUtils.getMessage(text);
    }

    @Override
    public ParamType getParamType() {
        return paramType;
    }
}
