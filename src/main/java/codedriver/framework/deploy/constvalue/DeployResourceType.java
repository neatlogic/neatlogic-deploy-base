package codedriver.framework.deploy.constvalue;

/**
 * 版本制品类型
 *
 * @author laiwt
 * @date 2022/06/29 4:16 下午
 */
public enum DeployResourceType {
    VERSION_PRODUCT("version_product", "版本制品", "app"),
    VERSION_SQL_SCRIPT("version_sql_script", "SQL脚本", "db"),
    ENV_PRODUCT("env_product", "环境制品", "app"),
    ENV_DIFF_DIRECTORY("env_diff_directory", "差异目录", "app.ins"),
    ENV_SQL_SCRIPT("env_sql_script", "SQL脚本", "db"),
    MIRROR_PRODUCT("mirror_product", "镜像制品", "app"),
    MIRROR_DIFF("mirror_diff", "镜像差异", "app.ins"),
    MIRROR_SQL_SCRIPT("mirror_sql_script", "SQL脚本", "db"),
    ;

    private final String value;
    private final String text;
    private final String directoryName; // runner中实际的目录名称

    DeployResourceType(String value, String text, String directoryName) {
        this.value = value;
        this.text = text;
        this.directoryName = directoryName;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public static DeployResourceType getDeployResourceType(String value) {
        for (DeployResourceType type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }


}
