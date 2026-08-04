package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.common.constvalue.ParamType;
import neatlogic.framework.notify.core.INotifyParam;
import neatlogic.framework.util.$;

/**
 * @author longrf
 * @date 2022/12/29 10:24
 */

public enum DeployJobNotifyParam implements INotifyParam {
    APPSYSTEMNAMEANDABBRNAME("appSystemNameAndAbbrName", "nfdc.deployjobnotifyparam.text.appsystemnameandabbrname", ParamType.STRING),
    APPMODULENAMEANDABBRNAME("appModuleNameAndAbbrName", "nfdc.deployjobnotifyparam.text.appmodulenameandabbrname", ParamType.STRING),
    ENVNAME("envName", "nfdc.deployjobnotifyparam.text.envname", ParamType.STRING),
    VERSION("version", "nfdc.deployjobnotifyparam.text.version", ParamType.STRING),
    SCENARIONAME("scenarioName", "nfdc.deployjobnotifyparam.text.scenarioname", ParamType.STRING),
    JOBID("deployJobId", "nfdc.deployjobnotifyparam.text.jobid", ParamType.NUMBER),
    JOBNAME("deployJobName", "nfdc.deployjobnotifyparam.text.jobname", ParamType.STRING),
    JOBSTATUS("deployJobStatus", "nfdc.deployjobnotifyparam.text.jobstatus", ParamType.STRING),
    JOBSTATUSNAME("deployJobStatusName", "nfdc.deployjobnotifyparam.text.jobstatusname", ParamType.STRING),
    JOBPHASELIST("deployJobPhaseList", "nfdc.deployjobnotifyparam.text.jobphaselist", ParamType.ARRAY),
    TRIGGERTYPENAME("deployTriggerTypeName", "nfdc.deployjobnotifyparam.text.triggertypename", ParamType.STRING),
    DEPLOYJOBSTARTTIME("deployJobStartTime", "nfdc.deployjobnotifyparam.text.deployjobstarttime", ParamType.STRING),
    DEPLOYJOBENDTIME("deployJobEndTime", "nfdc.deployjobnotifyparam.text.deployjobendtime", ParamType.STRING),
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
        return $.t(text);
    }

    @Override
    public ParamType getParamType() {
        return paramType;
    }
}
