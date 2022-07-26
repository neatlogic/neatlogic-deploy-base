/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployAppEnvAutoConfigVo extends BaseEditorVo {
    private static final long serialVersionUID = -1948079785908118588L;
    @EntityField(name = "应用id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "实例id", type = ApiParamType.LONG)
    private Long instanceId = 0L;
    @EntityField(name = "实例名称", type = ApiParamType.STRING)
    private String instanceName;
    @EntityField(name = "实例ip", type = ApiParamType.STRING)
    private String instanceIp ;
    @EntityField(name = "实例名称", type = ApiParamType.INTEGER)
    private Integer instancePort;
    @EntityField(name = "是否有AutoConfig", type = ApiParamType.INTEGER)
    private Integer isAutoConfig ;

    private List<DeployAppEnvAutoConfigKeyValueVo> keyValueList;

    public DeployAppEnvAutoConfigVo() {
    }

    public DeployAppEnvAutoConfigVo(Long appSystemId, Long appModuleId, Long envId) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
    }

    public DeployAppEnvAutoConfigVo(Long appSystemId, Long appModuleId, Long envId, Long instanceId) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.instanceId = instanceId;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstanceIp() {
        return instanceIp;
    }

    public void setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
    }

    public Integer getInstancePort() {
        return instancePort;
    }

    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    public List<DeployAppEnvAutoConfigKeyValueVo> getKeyValueList() {
        return keyValueList;
    }

    public void setKeyValueList(List<DeployAppEnvAutoConfigKeyValueVo> keyValueList) {
        this.keyValueList = keyValueList;
    }

    public Integer getIsAutoConfig() {
        return isAutoConfig;
    }

    public void setIsAutoConfig(Integer isAutoConfig) {
        this.isAutoConfig = isAutoConfig;
    }
}
