/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

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
    @EntityField(name = "common.id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "term.cmdb.appsystemid", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "term.cmdb.appsystemname", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "term.cmdb.appsystemabbrname", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "term.cmdb.appmoduleid", type = ApiParamType.LONG)
    private Long appModuleId = 0L;
    @EntityField(name = "term.cmdb.appmodulename", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "term.cmdb.appmoduleabbrname", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "term.cmdb.envid", type = ApiParamType.LONG)
    private Long envId = 0L;
    @EntityField(name = "term.cmdb.envname", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "nfdda.deployappconfigvo.path.name", type = ApiParamType.STRING)
    private String path;
    @EntityField(name = "nfdda.deployappconfigvo.config.name", type = ApiParamType.JSONOBJECT)
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
