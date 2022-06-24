package codedriver.framework.deploy.dto.app;

import codedriver.framework.cmdb.dto.resourcecenter.entity.AppModuleVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

/**
 * @author longrf
 * @date 2022/6/23 3:41 下午
 */
public class DeployAppModuleVo extends AppModuleVo {

    @EntityField(name = "环境个数", type = ApiParamType.INTEGER)
    private Integer envCount;
    @EntityField(name = "是否有环境（1：有，0：没有）", type = ApiParamType.INTEGER)
    private Integer isHasEnv = 0;

    public Integer getEnvCount() {
        return envCount;
    }

    public void setEnvCount(Integer envCount) {
        this.envCount = envCount;
    }

    public Integer getIsHasEnv() {
        return isHasEnv;
    }

    public void setIsHasEnv(Integer isHasEnv) {
        this.isHasEnv = isHasEnv;
    }
}
