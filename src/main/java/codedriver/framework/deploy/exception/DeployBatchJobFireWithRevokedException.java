/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.exception;

import codedriver.framework.autoexec.dto.job.AutoexecJobVo;
import codedriver.framework.exception.core.ApiRuntimeException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lvzk
 * @date 2022/8/2 9:55 上午
 */
public class DeployBatchJobFireWithRevokedException extends ApiRuntimeException {

    private static final long serialVersionUID = 2949252138258270630L;

    public DeployBatchJobFireWithRevokedException(List<AutoexecJobVo> autoexecJobVos) {
        super("执行批量作业不允许存在'已撤销'的作业：" + autoexecJobVos.stream().map(o->o.getName()+"("+o.getId()+")").collect(Collectors.joining(",")));
    }
}
