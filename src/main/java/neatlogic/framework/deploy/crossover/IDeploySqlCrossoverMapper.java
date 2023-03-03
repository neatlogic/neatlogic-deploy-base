package neatlogic.framework.deploy.crossover;

import neatlogic.framework.crossover.ICrossoverService;
import neatlogic.framework.deploy.dto.sql.DeploySqlNodeDetailVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author longrf
 * @date 2022/4/28 2:10 下午
 */
public interface IDeploySqlCrossoverMapper extends ICrossoverService {

    List<DeploySqlNodeDetailVo> getDeploySqlDetailList(@Param("sqlFileDetailVoList") List<DeploySqlNodeDetailVo> sqlFileDetailVoList);

    List<Long> getDeployJobSqlIdListByJobIdAndJobPhaseNameList(@Param("jobId") Long jobId, @Param("jobPhaseNameList") List<String> jobPhaseNameList);

    void resetDeploySqlStatusBySqlIdList(@Param("idList") List<Long> idList);
}
