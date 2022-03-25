package codedriver.framework.deploy.dao.mapper;


import codedriver.framework.deploy.dto.profile.DeployProfileOperationVo;
import codedriver.framework.deploy.dto.profile.DeployProfileVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author longrf
 * @date 2022/3/16 11:42 上午
 */
public interface DeployProfileMapper {

    int searchDeployProfileCount(DeployProfileVo profileVo);

    int checkProfileIsExists(Long id);

    int checkProfileNameIsRepeats(DeployProfileVo vo);

    List<Long> getDeployProfileIdList(DeployProfileVo profileVo);

    List<DeployProfileVo> searchDeployProfile(DeployProfileVo profileVo);

    List<DeployProfileVo> searchProfileListByIdList(@Param("idList") List<Long> idList);

    List<DeployProfileOperationVo> getProfileOperationVoListByProfileId(Long id);

    DeployProfileVo getProfileVoById(Long id);

    void insertDeployProfileOperationByProfileIdAndOperateIdListAndType(@Param("profileId") Long profileId, @Param("operateIdList") List<Long> operateIdList, @Param("type") String type);

    void insertProfile(DeployProfileVo profileVo);

    void updateProfile(DeployProfileVo profileVo);

    void deleteProfileById(Long id);

    void deleteProfileOperateByProfileId(Long id);

}
