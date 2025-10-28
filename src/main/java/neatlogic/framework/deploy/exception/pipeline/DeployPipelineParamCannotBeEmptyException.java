package neatlogic.framework.deploy.exception.pipeline;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class DeployPipelineParamCannotBeEmptyException extends ApiRuntimeException {

    private static final long serialVersionUID = -977868475722886186L;

    public DeployPipelineParamCannotBeEmptyException(int LaneSort, int groupSort, int jobTemplateSort, String name, String key) {
        super("nfdep.deploypipelineparamcannotbeemptyexception.deploypipelineparamcannotbeemptyexception", LaneSort, groupSort, jobTemplateSort, name, key);
    }
}
