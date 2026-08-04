/*Copyright (C) 2023  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployAppEnvAutoConfigVo extends BaseEditorVo {
    private static final long serialVersionUID = -1948079785908118588L;
    @EntityField(name = "nfdda.deployappenvautoconfigvo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfdda.deployappenvautoconfigvo.appmoduleid.name", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "nfdda.deployappenvautoconfigvo.envid.name", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "nfdda.deployappenvautoconfigvo.instanceid.name", type = ApiParamType.LONG)
    private Long instanceId = 0L;
    @EntityField(name = "nfdda.deployappenvautoconfigvo.instancename.name", type = ApiParamType.STRING)
    private String instanceName;
    @EntityField(name = "nfdda.deployappenvautoconfigvo.instanceip.name", type = ApiParamType.STRING)
    private String instanceIp ;
    @EntityField(name = "nfdda.deployappenvautoconfigvo.instanceport.name", type = ApiParamType.INTEGER)
    private Integer instancePort;
    @EntityField(name = "nfdda.deployappenvautoconfigvo.isautoconfig.name", type = ApiParamType.INTEGER)
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

    public DeployAppEnvAutoConfigVo(Long appSystemId, Long appModuleId, Long envId, List<DeployAppEnvAutoConfigKeyValueVo> keyValueList) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.keyValueList = keyValueList;
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
