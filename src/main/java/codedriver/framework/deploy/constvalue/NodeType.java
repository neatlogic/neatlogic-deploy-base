/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.constvalue;

import codedriver.framework.autoexec.constvalue.INodeType;

public enum NodeType implements INodeType {
    DEPLOY_SQL_NODE("deploy_sql_node"),
    ;
    private final String value;

    NodeType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

}
