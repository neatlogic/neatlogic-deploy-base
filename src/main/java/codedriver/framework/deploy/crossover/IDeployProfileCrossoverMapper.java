package codedriver.framework.deploy.crossover;

import codedriver.framework.crossover.ICrossoverService;

/**
 * @author longrf
 * @date 2022/3/30 6:50 下午
 */
public interface IDeployProfileCrossoverMapper extends ICrossoverService {
    void deleteProfileOperationByOperationId(Long id);
}
