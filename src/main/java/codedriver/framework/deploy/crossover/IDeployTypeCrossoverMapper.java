package codedriver.framework.deploy.crossover;

import codedriver.framework.crossover.ICrossoverService;

/**
 * @author longrf
 * @date 2022/12/9 12:16
 */

public interface IDeployTypeCrossoverMapper extends ICrossoverService {

    void deleteTypeActiveByTypeId(Long typeId);
}
