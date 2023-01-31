/*
 * Copyright(c) 2021. TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.chart;

import org.springframework.util.ClassUtils;

public interface IDeployVersionChartHandler {

    /**
     * 图表Tab名称
     *
     * @return
     */
    String getName();

    /**
     * 获取图表数据
     *
     * @param chartName 图表名称
     * @param versionId 版本ID
     * @return
     */
    Object getChartData(String chartName, Long versionId);

    default String getClassName() {
        return ClassUtils.getUserClass(this.getClass()).getName();
    }
}
