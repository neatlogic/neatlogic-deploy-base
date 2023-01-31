/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

import java.util.List;

public class DeployAppConfigDBSchemaActionIrregularException extends ApiRuntimeException {
    public DeployAppConfigDBSchemaActionIrregularException(List<String> schemaList) {
        super("以下schema输入格式不规范，请输入：dbname.username。不规范schema：" + schemaList);
    }
}
