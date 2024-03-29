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
import neatlogic.framework.auth.core.AuthActionChecker;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.auth.DEPLOY_MODIFY;
import neatlogic.framework.deploy.constvalue.DeployAppConfigActionType;
import neatlogic.framework.restful.annotation.EntityField;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author longrf
 * @date 2022/6/23 3:41 下午
 */
public class DeployAppSystemVo extends BaseEditorVo {
    private static final long serialVersionUID = 3794860793337591800L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "简称", type = ApiParamType.STRING)
    private String abbrName;
    @EntityField(name = "维护窗口", type = ApiParamType.STRING)
    private List<String> maintenanceWindow;
    @EntityField(name = "备注", type = ApiParamType.STRING)
    private String description;
    @EntityField(name = "是否被收藏（1：收藏，0：取消收藏）", type = ApiParamType.INTEGER)
    private Integer isFavorite;
    @EntityField(name = "是否已配置（1：已配置，0：未配置）", type = ApiParamType.INTEGER)
    private Integer isConfig;
    @EntityField(name = "应用模块列表", type = ApiParamType.JSONARRAY)
    private List<DeployAppModuleVo> appModuleList;
    @EntityField(name = "状态id列表", type = ApiParamType.JSONARRAY)
    private List<Long> state;
    @EntityField(name = "负责人id列表", type = ApiParamType.JSONARRAY)
    private List<Long> owner;

    @EntityField(name = "是否包含模块", type = ApiParamType.INTEGER)
    private Integer isHasModule = 0;
    @EntityField(name = "是否包含环境", type = ApiParamType.INTEGER)
    private Integer isHasEnv = 0;
    @EntityField(name = "是否配置权限", type = ApiParamType.INTEGER)
    private Integer isConfigAuthority = 0;
    @EntityField(name = "是否拥有所有数据权限", type = ApiParamType.INTEGER)
    private Integer isHasAllAuthority;
    @EntityField(name = "是否拥有资源锁", type = ApiParamType.INTEGER)
    private Integer isHasResourceLock = 0;


    @JSONField(serialize = false)
    private List<DeployAppConfigAuthorityVo> authList;
    @JSONField(serialize = false)
    private List<DeployAppConfigAuthorityActionVo> authActionVoList;

    @JSONField(serialize = false)
    private List<Long> envIdList;

    @EntityField(name = "权限动作列表", type = ApiParamType.JSONARRAY)
    Set<String> authActionSet;

    public DeployAppSystemVo() {

    }

    public DeployAppSystemVo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DeployAppSystemVo(Long id, String name, String abbrName) {
        this.id = id;
        this.name = name;
        this.abbrName = abbrName;
    }

    public Long getId() {
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

    public String getAbbrName() {
        return abbrName;
    }

    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName;
    }

    public List<String> getMaintenanceWindow() {
        return maintenanceWindow;
    }

    public void setMaintenanceWindow(List<String> maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Integer getIsConfig() {
        return isConfig;
    }

    public void setIsConfig(Integer isConfig) {
        this.isConfig = isConfig;
    }

    public List<DeployAppModuleVo> getAppModuleList() {
        return appModuleList;
    }

    public void setAppModuleList(List<DeployAppModuleVo> appModuleList) {
        this.appModuleList = appModuleList;
    }

    public List<Long> getState() {
        return state;
    }

    public void setState(List<Long> state) {
        this.state = state;
    }

    public List<Long> getOwner() {
        return owner;
    }

    public void setOwner(List<Long> owner) {
        this.owner = owner;
    }

    public Integer getIsHasModule() {
        return isHasModule;
    }

    public void setIsHasModule(Integer isHasModule) {
        this.isHasModule = isHasModule;
    }

    public Integer getIsHasEnv() {
        return isHasEnv;
    }

    public void setIsHasEnv(Integer isHasEnv) {
        this.isHasEnv = isHasEnv;
    }

    public Integer getIsConfigAuthority() {
        return isConfigAuthority;
    }

    public void setIsConfigAuthority(Integer isConfigAuthority) {
        this.isConfigAuthority = isConfigAuthority;
    }

    public List<Long> getEnvIdList() {
        return envIdList;
    }

    public void setEnvIdList(List<Long> envIdList) {
        this.envIdList = envIdList;
    }

    public List<DeployAppConfigAuthorityVo> getAuthList() {
        return authList;
    }

    public void setAuthList(List<DeployAppConfigAuthorityVo> authList) {
        this.authList = authList;
    }

    public List<DeployAppConfigAuthorityActionVo> getAuthActionVoList() {
        return authActionVoList;
    }

    public void setAuthActionVoList(List<DeployAppConfigAuthorityActionVo> authActionVoList) {
        this.authActionVoList = authActionVoList;
    }

    public Set<String> getAuthActionSet() {
        if (CollectionUtils.isNotEmpty(authActionSet)) {
            return authActionSet;
        }
        if (CollectionUtils.isEmpty(authActionVoList)) {
            return authActionSet;
        }
        authActionSet = new HashSet<>();
       /* 拼接权限数据结构：
          1、循环权限类型，将可能拥有一个类型所有权限的类型优先拼接
          2、循环已有权限，将其余散存的权限拼接*/

        // map<权限类型，权限列表>
        Map<String, List<DeployAppConfigAuthorityActionVo>> authTypeAuthActionListMap = authActionVoList.stream().collect(Collectors.groupingBy(DeployAppConfigAuthorityActionVo::getType));

        List<String> allActionTypeList = new ArrayList<>();
        //循环权限类型
        for (String actionType : DeployAppConfigActionType.getValueList()) {
            List<DeployAppConfigAuthorityActionVo> actionTypeActionVoList = authTypeAuthActionListMap.get(actionType);
            if (CollectionUtils.isEmpty(actionTypeActionVoList)) {
                continue;
            }
            //拥有当前类型的所有权限
            if (CollectionUtils.isNotEmpty(actionTypeActionVoList.stream().filter(e -> StringUtils.equals(e.getAction(), "all")).collect(Collectors.toList()))) {
                authActionSet.add(actionType + "#all");
                allActionTypeList.add(actionType);
            }
        }
        //循环拥有的权限，将其余散存的权限拼接
        for (DeployAppConfigAuthorityActionVo actionVo : authActionVoList) {
            if (!allActionTypeList.contains(actionVo.getType())) {
                authActionSet.add(actionVo.getType() + "#" + actionVo.getAction());
            }
        }
        return authActionSet;
    }

    public void setAuthActionSet(Set<String> authActionSet) {
        this.authActionSet = authActionSet;
    }

    public Integer getIsHasAllAuthority() {
        if (isHasAllAuthority == null) {
            if (AuthActionChecker.check(DEPLOY_MODIFY.class)) {
                isHasAllAuthority = 1;
            } else {
                isHasAllAuthority = 0;
            }
        }
        return isHasAllAuthority;
    }

    public void setIsHasAllAuthority(Integer isHasAllAuthority) {
        this.isHasAllAuthority = isHasAllAuthority;
    }

    public Integer getIsHasResourceLock() {
        return isHasResourceLock;
    }

    public void setIsHasResourceLock(Integer isHasResourceLock) {
        this.isHasResourceLock = isHasResourceLock;
    }
}
