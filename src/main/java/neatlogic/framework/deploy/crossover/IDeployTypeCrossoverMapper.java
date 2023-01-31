package neatlogic.framework.deploy.crossover;

import neatlogic.framework.crossover.ICrossoverService;

/**
 * @author longrf
 * @date 2022/12/9 12:16
 */

public interface IDeployTypeCrossoverMapper extends ICrossoverService {

    void deleteTypeActiveByTypeId(Long typeId);
}
