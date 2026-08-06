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
    ENVNAME("envName", "term.cmdb.envname", ParamType.STRING),
    VERSION("version", "common.versionnum", ParamType.STRING),
    SCENARIONAME("scenarioName", "term.autoexec.scenario", ParamType.STRING),
    JOBID("deployJobId", "term.autoexec.jobid", ParamType.NUMBER),
    JOBNAME("deployJobName", "nfdc.deployjobnotifyparam.text.jobname", ParamType.STRING),
    JOBSTATUS("deployJobStatus", "term.autoexec.jobstatuslabel", ParamType.STRING),
    JOBSTATUSNAME("deployJobStatusName", "term.autoexec.jobstatusname", ParamType.STRING),
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
