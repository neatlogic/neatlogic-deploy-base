package codedriver.framework.deploy.dto.app;

import codedriver.framework.cmdb.dto.resourcecenter.ResourceSearchVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;


/**
 * @author longrf
 * @date 2022/6/23 5:33 下午
 */
public class DeployResourceSearchVo extends ResourceSearchVo {
    @EntityField(name = "是否已配置（1：已配置，0：未配置）", type = ApiParamType.INTEGER)
    private Integer isConfig;
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId ;

    @JSONField(serialize = false)
    private List<Long> notInIdList;

    public Integer getIsConfig() {
        return isConfig;
    }

    public void setIsConfig(Integer isConfig) {
        this.isConfig = isConfig;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    @Override
    public Long getAppModuleId() {
        return appModuleId;
    }

    @Override
    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    @Override
    public Long getEnvId() {
        return envId;
    }

    @Override
    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public List<Long> getNotInIdList() {
        return notInIdList;
    }

    public void setNotInIdList(List<Long> notInIdList) {
        this.notInIdList = notInIdList;
    }
}
