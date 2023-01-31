/*
 * Copyright(c) 2021. TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.chart;

import com.alibaba.fastjson.JSONObject;

public abstract class DeployVersionChartHandlerBase implements IDeployVersionChartHandler {

    @Override
    public Object getChartData(String chartName, Long versionId) {
        return myGetChartData(chartName, versionId);
    }

    protected abstract JSONObject myGetChartData(String chartName, Long versionId);
}
