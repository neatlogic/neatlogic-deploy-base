package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.common.constvalue.ParamType;
import neatlogic.framework.notify.core.INotifyParam;
import neatlogic.framework.util.I18nUtils;

/**
 * @author longrf
 * @date 2022/12/29 10:24
 */

public enum DeployJobNotifyParam implements INotifyParam {
    APPSYSTEMNAMEANDABBRNAME("appSystemNameAndAbbrName", "enum.deploy.deployjobnotifyparam.appsystemnameandabbrname", ParamType.STRING),
    APPMODULENAMEANDABBRNAME("appModuleNameAndAbbrName", "enum.deploy.deployjobnotifyparam.appmodulenameandabbrname", ParamType.STRING),
    ENVNAME("envName", "enum.deploy.deployjobnotifyparam.envname", ParamType.STRING),
    VERSION("version", "enum.deploy.deployjobnotifyparam.version", ParamType.STRING),
    SCENARIONAME("scenarioName", "enum.deploy.deployjobnotifyparam.scenarioname", ParamType.STRING),
    JOBID("deployJobId", "enum.deploy.deployjobnotifyparam.jobid", ParamType.NUMBER),
    JOBNAME("deployJobName", "enum.deploy.deployjobnotifyparam.jobname", ParamType.STRING),
    JOBSTATUS("deployJobStatus", "enum.deploy.deployjobnotifyparam.jobstatus", ParamType.STRING),
    JOBPHASELIST("deployJobPhaseList", "enum.deploy.deployjobnotifyparam.jobphaselist", ParamType.ARRAY),
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
