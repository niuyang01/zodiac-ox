package com.whut.zodiac.ox.core.flux.model.entity.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceConfig {

    // 服务编码
    @Id
    private String serviceCode;

    // 交互模板ID
    private String interactionTemplateId;

    // 接口集成配置ID
    private String interfaceIntegrationConfigId;

    // 参数映射配置ID
    private String paramMappingConfigId;

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getInteractionTemplateId() {
        return interactionTemplateId;
    }

    public void setInteractionTemplateId(String interactionTemplateId) {
        this.interactionTemplateId = interactionTemplateId;
    }

    public String getInterfaceIntegrationConfigId() {
        return interfaceIntegrationConfigId;
    }

    public void setInterfaceIntegrationConfigId(String interfaceIntegrationConfigId) {
        this.interfaceIntegrationConfigId = interfaceIntegrationConfigId;
    }

    public String getParamMappingConfigId() {
        return paramMappingConfigId;
    }

    public void setParamMappingConfigId(String paramMappingConfigId) {
        this.paramMappingConfigId = paramMappingConfigId;
    }
}
