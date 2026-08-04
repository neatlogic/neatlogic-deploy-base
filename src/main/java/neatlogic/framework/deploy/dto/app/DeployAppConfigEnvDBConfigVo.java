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
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @author longrf
 * @date 2022/7/1 3:29 下午
 */
public class DeployAppConfigEnvDBConfigVo {

    private static final long serialVersionUID = -1948079786425118588L;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.appmoduleid.name", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.envid.name", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.id.name", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.dbschema.name", type = ApiParamType.STRING)
    private String dbSchema;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.dbresourceid.name", type = ApiParamType.LONG)
    private Long dbResourceId;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.accountid.name", type = ApiParamType.LONG)
    private Long accountId;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.account.name", type = ApiParamType.STRING)
    private String account;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.dbresourcename.name", type = ApiParamType.STRING)
    private String dbResourceName;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.passwordcipher.name", type = ApiParamType.STRING)
    private String passwordCipher;
    @EntityField(name = "nfdda.deployappconfigenvdbconfigvo.config.name", type = ApiParamType.JSONOBJECT)
    private JSONObject config;
    @JSONField(serialize = false)
    private String configStr;

    public DeployAppConfigEnvDBConfigVo() {
    }

    public DeployAppConfigEnvDBConfigVo(Long appSystemId, Long appModuleId, Long envId) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
    }

    public DeployAppConfigEnvDBConfigVo(Long appSystemId, Long appModuleId, Long envId, String dbSchema) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.dbSchema = dbSchema;
    }

    public DeployAppConfigEnvDBConfigVo(Long appSystemId, Long appModuleId, Long envId, String dbSchema, JSONObject config) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.dbSchema = dbSchema;
        this.config = config;
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

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDbSchema() {
        return dbSchema;
    }

    public void setDbSchema(String dbSchema) {
        this.dbSchema = dbSchema;
    }

    public Long getDbResourceId() {
        return dbResourceId;
    }

    public void setDbResourceId(Long dbResourceId) {
        this.dbResourceId = dbResourceId;
    }

    public String getDbResourceName() {
        return dbResourceName;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setDbResourceName(String dbResourceName) {
        this.dbResourceName = dbResourceName;
    }

    public JSONObject getConfig() {
        if (MapUtils.isEmpty(config) && StringUtils.isNotBlank(configStr)) {
            config = JSONObject.parseObject(configStr);
        }
        return config;
    }

    public void setConfig(JSONObject config) {
        this.config = config;
    }

    public String getConfigStr() {
        if (StringUtils.isEmpty(configStr) && MapUtils.isNotEmpty(config)) {
            configStr = config.toJSONString();
        }
        return configStr;
    }

    public void setConfigStr(String configStr) {
        this.configStr = configStr;
    }

    public String getPasswordCipher() {
        return passwordCipher;
    }

    public void setPasswordCipher(String passwordCipher) {
        this.passwordCipher = passwordCipher;
    }
}
