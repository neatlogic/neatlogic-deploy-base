package codedriver.framework.deploy.constvalue;

public enum DeployVersionChartType {
    LAST_CODE_ISSUE(DeployVersionChartMenu.CODE_SCAN.getValue(), "last_code_issue", "最近一次代码问题"),
    LAST_FIVE_ANNOTATION_RATE(DeployVersionChartMenu.CODE_SCAN.getValue(), "last_five_annotation_rate", "最近五次注释率"),
    LAST_FIVE_CODE_STATISTICS(DeployVersionChartMenu.CODE_SCAN.getValue(), "last_five_code_statistics", "最近五次代码统计"),
    CODE_QUALITY_TREND(DeployVersionChartMenu.CODE_SCAN.getValue(), "code_quality_trend", "bug/漏洞/代码异味趋势图"),
    CODE_COVERAGE_AND_REPEATABILITY(DeployVersionChartMenu.CODE_SCAN.getValue(), "code_coverage_and_repeatability", "覆盖率/重复度趋势图"),

    LAST_CODE_TEST_RESULT(DeployVersionChartMenu.UNIT_TEST.getValue(), "LAST_CODE_TEST_RESULT", "最近一次代码测试结果"),
    LAST_FIVE_INCREMENTAL_COVERAGE_RATE(DeployVersionChartMenu.UNIT_TEST.getValue(), "last_five_incremental_coverage_rate", "最近五次增量覆盖率"),
    LAST_FIVE_FULL_COVERAGE_RATE(DeployVersionChartMenu.UNIT_TEST.getValue(), "last_five_full_coverage_rate", "最近五次全量覆盖率"),
    ;

    private final String menu;
    private final String value;
    private final String test;

    DeployVersionChartType(String menu, String value, String test) {
        this.menu = menu;
        this.value = value;
        this.test = test;
    }

    public String getMenu() {
        return menu;
    }

    public String getValue() {
        return value;
    }

    public String getTest() {
        return test;
    }
}
