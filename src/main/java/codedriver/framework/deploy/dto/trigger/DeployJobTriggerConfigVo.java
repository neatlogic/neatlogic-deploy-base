/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.trigger;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployJobTriggerConfigVo {
    @EntityField(name = "源环境id集合", type = ApiParamType.JSONARRAY)
    private List<Long> envIdList;
    @EntityField(name = "作业状态集合", type = ApiParamType.JSONARRAY)
    private List<String> jobStatusList;
    @EntityField(name = "场景名", type = ApiParamType.STRING)
    private String scenarioName;
    @EntityField(name = "编译号", type = ApiParamType.INTEGER)
    private Integer buildNo;
    @EntityField(name = "目标环境名", type = ApiParamType.STRING)
    private String targetEnvName;

    public List<Long> getEnvIdList() {
        return envIdList;
    }

    public void setEnvIdList(List<Long> envIdList) {
        this.envIdList = envIdList;
    }

    public List<String> getJobStatusList() {
        return jobStatusList;
    }

    public void setJobStatusList(List<String> jobStatusList) {
        this.jobStatusList = jobStatusList;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public String getTargetEnvName() {
        return targetEnvName;
    }

    public void setTargetEnvName(String targetEnvName) {
        this.targetEnvName = targetEnvName;
    }
}
