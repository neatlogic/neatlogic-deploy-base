package neatlogic.framework.deploy.constvalue;

public enum VersionDirection{
    FORWARD("forward"),
    ROLLBACK("rollback");

    private final String value;

    VersionDirection(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
