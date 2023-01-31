package neatlogic.framework.deploy.constvalue;

public enum DeployEnvVersionStatus {
    DEPLOYED("deployed"),
    PENDING("pending"),
    ;

    private final String value;

    DeployEnvVersionStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
