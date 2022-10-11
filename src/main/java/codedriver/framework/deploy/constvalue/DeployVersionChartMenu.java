package codedriver.framework.deploy.constvalue;

public enum DeployVersionChartMenu {
    CODE_SCAN("code_scan"),
    UNIT_TEST("unit_test"),
    ;

    private final String value;

    DeployVersionChartMenu(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
