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
package neatlogic.framework.deploy.dto.codehub;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

import java.io.Serializable;

public class RepositoryServiceVo extends BaseEditorVo implements Serializable {


    /**
     * id
     */
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;

    /**
     * name
     */
    @EntityField(name = "服务名称", type = ApiParamType.STRING)
    private String name;

    /**
     * type
     */
    @EntityField(name = "仓库类型...[gitlab,svn]", type = ApiParamType.ENUM)
    private String type;

    /**
     * address
     */
    @EntityField(name = "服务地址", type = ApiParamType.STRING)
    private String address;

    /**
     * username
     */
    @EntityField(name = "用户名", type = ApiParamType.STRING)
    private String username;

    /**
     * password
     */
    @EntityField(name = "密码", type = ApiParamType.STRING)
    private String password;

    /**
     * status
     */
    @EntityField(name = "同步状态，success：成功，failed：失败...[success,failed]", type = ApiParamType.ENUM)
    private String status;
    
    
    @EntityField(name = "排序规则,如: lcd ASC", type = ApiParamType.STRING)
    private String sortColumn;

    @EntityField(name = "服务代理id", type = ApiParamType.LONG)
    private Long codehubAgentId;

    private Boolean delegation = false;

    private static final long serialVersionUID = 1L;
    
    public Boolean getDelegation() {
        return delegation;
    }
    
    public void setDelegation(Boolean delegation) {
        this.delegation = delegation;
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

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return this.type;
    }
    
    public void setType(String type){
        this.type = type;
    }

    public String getAddress(){
        return this.address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }

    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    public String getStatus(){
        return this.status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }

    
    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public Long getCodehubAgentId() {
        return codehubAgentId;
    }

    public void setCodehubAgentId(Long codehubAgentId) {
        this.codehubAgentId = codehubAgentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("id=").append(id).append(", ");
        sb.append("name=").append(name).append(", ");
        sb.append("type=").append(type).append(", ");
        sb.append("address=").append(address).append(", ");
        sb.append("username=").append(username).append(", ");
        sb.append("password=").append(password).append(", ");
        sb.append("status=").append(status);
        sb.append("]");
        return sb.toString();
    }

    
}