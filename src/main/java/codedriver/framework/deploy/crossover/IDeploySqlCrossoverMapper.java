package codedriver.framework.deploy.crossover;

import codedriver.framework.autoexec.dto.job.AutoexecJobPhaseNodeVo;
import codedriver.framework.crossover.ICrossoverService;
import codedriver.framework.deploy.dto.sql.DeploySqlDetailVo;
import codedriver.framework.deploy.dto.sql.DeploySqlJobPhaseVo;
import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author longrf
 * @date 2022/4/28 2:10 下午
 */
public interface IDeploySqlCrossoverMapper extends ICrossoverService {

    DeploySqlDetailVo getDeploySqlBySysIdAndModuleIdAndEnvIdAndVersionAndSqlFile(@Param("sysId") Long sysId, @Param("envId") Long envId, @Param("moduleId") Long moduleId, @Param("version") String version, @Param("sqlFile") String sqlFile);

    int searchDeploySqlCount(AutoexecJobPhaseNodeVo jobPhaseNodeVo);

    List<DeploySqlDetailVo> searchDeploySql(AutoexecJobPhaseNodeVo jobPhaseNodeVo);

    List<DeploySqlDetailVo> getDeploySqlDetailList(@Param("sqlFileDetailVoList") List<DeploySqlDetailVo> sqlFileDetailVoList);

    List<DeploySqlDetailVo> getAllDeploySqlDetailList(DeploySqlDetailVo deployVersionSql);

    void updateDeploySqlDetailIsDeleteAndStatusAndMd5ById(@Param("status") String status, @Param("md5") String md5, @Param("id") Long id);

    void updateDeploySqlIsDeleteByIdList(@Param("idList") List<Long> idList);

    void insertDeploySqlDetail(@Param("sqlVo") DeploySqlDetailVo paramDeploySqlVo, @Param("sysId") Long sysId, @Param("envId") Long envId, @Param("moduleId") Long moduleId, @Param("version") String version, @Param("runnerId") Long runnerId);

    void insertDeploySql(DeploySqlJobPhaseVo deploySqlVo);

    void resetDeploySqlStatusByJobIdAndPhaseNameList(@Param("jobId") Long jobId, @Param("jobPhaseNameList") List<String> jobPhaseNameList);

    void resetDeploySqlStatusBySqlIdList(@Param("idList") JSONArray idList);
}
