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
