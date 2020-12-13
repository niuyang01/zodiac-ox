package com.whut.zodiac.ox.core.model.entity.persistence;

public class ParamMappingConfig {

    // 配置ID
    private String id;

    // 接口集成配置ID
    private String interfaceIntegrationConfigId;

    // 请求参数映射脚本
    private String requestMappingScript;

    // 返回参数映射脚本
    private String responseMappingScript;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInterfaceIntegrationConfigId() {
        return interfaceIntegrationConfigId;
    }

    public void setInterfaceIntegrationConfigId(String interfaceIntegrationConfigId) {
        this.interfaceIntegrationConfigId = interfaceIntegrationConfigId;
    }

    public String getRequestMappingScript() {
        return requestMappingScript;
    }

    public void setRequestMappingScript(String requestMappingScript) {
        this.requestMappingScript = requestMappingScript;
    }

    public String getResponseMappingScript() {
        return responseMappingScript;
    }

    public void setResponseMappingScript(String responseMappingScript) {
        this.responseMappingScript = responseMappingScript;
    }
}
