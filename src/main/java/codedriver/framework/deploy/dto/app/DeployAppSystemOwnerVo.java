package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

/**
 * @author longrf
 * @date 2022/7/19 16:29
 */
public class DeployAppSystemOwnerVo {

    private static final long serialVersionUID = 3712156893337591800L;

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;

    public DeployAppSystemOwnerVo() {
    }

    public DeployAppSystemOwnerVo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
