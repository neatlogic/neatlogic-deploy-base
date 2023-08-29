package neatlogic.framework.deploy.dto.version;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.asynchronization.threadlocal.UserContext;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

public class DeployVersionTheadVo {
    @EntityField(name = "common.config", type = ApiParamType.JSONOBJECT)
    private JSONObject config;

    @JSONField(serialize = false)
    private String configStr;

    public JSONObject getConfig() {
        if(MapUtils.isEmpty(config) && StringUtils.isNotBlank(configStr)) {
            return JSONObject.parseObject(configStr);
        }
        return config;
    }

    public void setConfig(JSONObject config) {
        this.config = config;
    }

    public String getConfigStr() {
        if(StringUtils.isBlank(configStr) && MapUtils.isNotEmpty(config)) {
            return config.toString();
        }
        return configStr;
    }

    public void setConfigStr(String configStr) {
        this.configStr = configStr;
    }

    public String getUserUuid() {
        if (UserContext.get() != null) {
            return UserContext.get().getUserUuid();
        } else {
            return null;
        }
    }
}
