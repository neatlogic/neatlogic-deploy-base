package codedriver.framework.deploy.crossover;

import codedriver.framework.crossover.ICrossoverService;
import codedriver.framework.deploy.dto.sql.DeploySqlDetailVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author longrf
 * @date 2022/4/28 2:10 下午
 */
public interface IDeploySqlCrossoverMapper extends ICrossoverService {

    List<DeploySqlDetailVo> getDeploySqlDetailList(@Param("sqlFileDetailVoList") List<DeploySqlDetailVo> sqlFileDetailVoList);

    List<Long> getJobSqlIdListByJobIdAndJobPhaseNameList(@Param("jobId") Long jobId, @Param("jobPhaseNameList") List<String> jobPhaseNameList);

    void resetDeploySqlStatusBySqlIdList(@Param("idList") List<Long> idList);
}
