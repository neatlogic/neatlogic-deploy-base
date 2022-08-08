package codedriver.framework.deploy.constvalue;

public enum DeployEnvVersionStatus {
    DEPLOYED("deployed"),
    PENDING("pending"),
    ROLLBACK("rollback"),
    ;

    private final String value;

    DeployEnvVersionStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
