package com.whut.zodiac.ox.core.model.entity.persistence;

public class InterfaceIntegrationConfig {

    // 接口集成配置ID
    private String id;

    // 外部SPI ID
    private String spiId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpiId() {
        return spiId;
    }

    public void setSpiId(String spiId) {
        this.spiId = spiId;
    }
}
