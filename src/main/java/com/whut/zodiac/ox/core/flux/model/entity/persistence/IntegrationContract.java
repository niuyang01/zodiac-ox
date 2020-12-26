package com.whut.zodiac.ox.core.flux.model.entity.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.StringJoiner;

@Entity
public class IntegrationContract {

    // 合约ID
    @Id
    private String contractId;

    // 来源
    private String source;

    // 服务编码
    private String serviceCode;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", IntegrationContract.class.getSimpleName() + "[", "]")
            .add("contractId='" + contractId + "'").add("source='" + source + "'")
            .add("serviceCode='" + serviceCode + "'").toString();
    }
}
