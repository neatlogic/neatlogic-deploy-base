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

    DeploySqlDetailVo getAutoexecJobIdByDeploySqlDetailVo(DeploySqlDetailVo paramDeploySqlVo);

    List<DeploySqlDetailVo> getJobDeploySqlDetailList(@Param("sqlFileDetailVoList") List<DeploySqlDetailVo> sqlFileDetailVoList);

    List<DeploySqlDetailVo> getAllJobDeploySqlDetailList(DeploySqlDetailVo deployVersionSql);

    void updateJobDeploySqlDetailIsDeleteAndStatusAndMd5AndLcdById(@Param("status") String status, @Param("md5") String md5, @Param("id") Long id);

    void updateJobDeploySqlIsDeleteByIdList(@Param("idList") List<Long> idList);
}
