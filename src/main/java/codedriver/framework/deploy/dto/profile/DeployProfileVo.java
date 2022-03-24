package codedriver.framework.deploy.dto.profile;

import codedriver.framework.autoexec.dto.AutoexecParamVo;
import codedriver.framework.autoexec.dto.AutoexecToolAndScriptVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author longrf
 * @date 2022/3/16 11:34 上午
 */
public class DeployProfileVo extends BaseEditorVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "描述", type = ApiParamType.STRING)
    private String description;
    @EntityField(name = "工具参数", type = ApiParamType.JSONOBJECT)
    private JSONObject config;
    @JSONField(serialize = false)
    private String configStr;
    @EntityField(name = "工具类型", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "所属系统id", type = ApiParamType.LONG)
    private Long systemId;
    @EntityField(name = "所属系统名称", type = ApiParamType.STRING)
    private String systemName;
    @EntityField(name = "工具库工具id/脚本工具id", type = ApiParamType.LONG)
    private Long operateId;
    @EntityField(name = "关联的工具和脚本列表", type = ApiParamType.JSONARRAY)
    private List<AutoexecToolAndScriptVo> autoexecToolAndScriptVoList;
    @EntityField(name = "关联的工具和脚本列表", type = ApiParamType.INTEGER)
    private Integer autoexecToolAndScriptCount = 0;
    @EntityField(name = "入参列表", type = ApiParamType.JSONARRAY)
    private List<AutoexecParamVo> paramList;
    @EntityField(name = "工具库工具id/脚本工具id列表", type = ApiParamType.JSONARRAY)
    private List<Long> operateIdList;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSystemId() {
        return systemId;
    }

    public void setSystemId(Long systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Long getOperateId() {
        return operateId;
    }

    public void setOperateId(Long operateId) {
        this.operateId = operateId;
    }

    public List<AutoexecToolAndScriptVo> getAutoexecToolAndScriptVoList() {
        return autoexecToolAndScriptVoList;
    }

    public void setAutoexecToolAndScriptVoList(List<AutoexecToolAndScriptVo> autoexecToolAndScriptVoList) {
        this.autoexecToolAndScriptVoList = autoexecToolAndScriptVoList;
    }

    public List<AutoexecParamVo> getParamList() {
        if (CollectionUtils.isEmpty(paramList) && StringUtils.isNotBlank(configStr)) {
            JSONObject toolConfig = JSONObject.parseObject(configStr);
            JSONArray params = toolConfig.getJSONArray("paramList");
            if (CollectionUtils.isNotEmpty(params)) {
                this.paramList = params.toJavaList(AutoexecParamVo.class);
            }
        }
        return paramList;
    }

    public void setParamList(List<AutoexecParamVo> paramList) {
        this.paramList = paramList;
    }

    public Integer getAutoexecToolAndScriptCount() {
        return autoexecToolAndScriptCount;
    }

    public void setAutoexecToolAndScriptCount(Integer autoexecToolAndScriptCount) {
        this.autoexecToolAndScriptCount = autoexecToolAndScriptCount;
    }

    public List<Long> getOperateIdList() {
        return operateIdList;
    }

    public void setOperateIdList(List<Long> operateIdList) {
        this.operateIdList = operateIdList;
    }
}
