/*Copyright (C) $today.year  深圳极向量科技有限公司 All Rights Reserved.

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

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.asynchronization.threadlocal.UserContext;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DeployAppConfigVo extends BaseEditorVo {
    private static final long serialVersionUID = -4457900289777364590L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "应用系统ID", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用系统名", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "应用系统简称", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "模块ID", type = ApiParamType.LONG)
    private Long appModuleId = 0L;
    @EntityField(name = "模块名", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "模块简称", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "环境ID", type = ApiParamType.LONG)
    private Long envId = 0L;
    @EntityField(name = "环境名", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "路径", type = ApiParamType.STRING)
    private String path;
    @EntityField(name = "流水线配置信息", type = ApiParamType.JSONOBJECT)
    private DeployPipelineConfigVo config;

    @JSONField(serialize = false)
    private String configStr;

    public DeployAppConfigVo() {
    }
    public DeployAppConfigVo(Long appSystemId) {
        this.appSystemId = appSystemId;
    }
    public DeployAppConfigVo(Long appSystemId, Long moduleId) {
        this.appSystemId = appSystemId;
        this.appModuleId = moduleId;
    }
    public DeployAppConfigVo(Long appSystemId, Long moduleId, Long envId) {
        this.appSystemId = appSystemId;
        this.appModuleId = moduleId;
        this.envId = envId;
    }
    public DeployAppConfigVo(Long appSystemId, Long moduleId, DeployPipelineConfigVo config) {
        this(appSystemId, moduleId, 0L, config);
    }

    public DeployAppConfigVo(Long appSystemId, Long moduleId, Long envId, DeployPipelineConfigVo config) {
        this.appSystemId = appSystemId;
        this.appModuleId = moduleId;
        this.envId = envId;
        this.config = config;
        this.setFcu(UserContext.get().getUserUuid());
        this.setLcu(UserContext.get().getUserUuid());
    }

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public DeployPipelineConfigVo getConfig() {
        if (config == null && StringUtils.isNotBlank(configStr)) {
            config = JSONObject.parseObject(configStr, DeployPipelineConfigVo.class);
        }
        return config;
    }

    public void setConfig(DeployPipelineConfigVo config) {
        if (config != null) {
            this.configStr = null;
        }
        this.config = config;
    }

    public String getConfigStr() {
        if (configStr == null && config != null) {
            configStr = JSONObject.toJSONString(config);
        }
        return configStr;
    }

    public void setConfigStr(String configStr) {
        if (configStr != null) {
            this.config = null;
        }
        this.configStr = configStr;
    }

    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public String getAppModuleName() {
        return appModuleName;
    }

    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName;
    }

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public String getAppModuleAbbrName() {
        return appModuleAbbrName;
    }

    public void setAppModuleAbbrName(String appModuleAbbrName) {
        this.appModuleAbbrName = appModuleAbbrName;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public String getPath() {
        if (StringUtils.isBlank(path)) {
            List<String> list = new ArrayList<>();
            if (StringUtils.isNotBlank(appSystemAbbrName)) {
                list.add(appSystemAbbrName);
            }
            if (StringUtils.isNotBlank(appModuleAbbrName)) {
                list.add(appModuleAbbrName);
            }
            if (StringUtils.isNotBlank(envName)) {
                list.add(envName);
            }
            if (CollectionUtils.isNotEmpty(list)) {
                path = String.join("/", list);
            }
        }
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
