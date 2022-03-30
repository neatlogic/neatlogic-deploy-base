package codedriver.framework.deploy.crossover;

import codedriver.framework.crossover.ICrossoverService;

/**
 * @author longrf
 * @date 2022/3/30 9:48 上午
 */
public interface IDeployCrossoverMapper extends ICrossoverService {

    void deleteProfileOperationByOperationId(Long id);


}
