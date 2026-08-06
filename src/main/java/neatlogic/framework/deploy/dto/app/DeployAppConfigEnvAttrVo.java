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

import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployAppConfigEnvAttrVo extends BaseEditorVo {
    private static final long serialVersionUID = -1948079785908118588L;
    @EntityField(name = "term.cmdb.appsystemid", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "term.cmdb.appmoduleid", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "term.cmdb.envid", type = ApiParamType.LONG)
    private Long envId;
    @JSONField(serialize = false)
    private List<String> keyList;
    //更新时间，用于删除
    @JSONField(serialize = false)
    private Long updateTime;

    private List<DeployAppEnvAutoConfigKeyValueVo> keyValueList;

    public DeployAppConfigEnvAttrVo() {
    }

    public DeployAppConfigEnvAttrVo(Long appSystemId, Long appModuleId, Long envId) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
    }

    public DeployAppConfigEnvAttrVo(Long appSystemId, Long appModuleId, Long envId, List<DeployAppEnvAutoConfigKeyValueVo> keyValueList) {
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

    public List<DeployAppEnvAutoConfigKeyValueVo> getKeyValueList() {
        return keyValueList;
    }

    public void setKeyValueList(List<DeployAppEnvAutoConfigKeyValueVo> keyValueList) {
        this.keyValueList = keyValueList;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public List<String> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<String> keyList) {
        this.keyList = keyList;
    }
}
