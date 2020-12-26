package com.whut.zodiac.ox.core.flux.model.mock;

import com.whut.zodiac.ox.core.flux.model.entity.persistence.IntegrationContract;
import com.whut.zodiac.ox.core.flux.model.repository.persistence.IntegrationContractRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigMetaDataMock {

    private static final Logger           log = LoggerFactory.getLogger(ConfigMetaDataMock.class);

    private IntegrationContractRepository integrationContractRepository;

    public void init() {

        IntegrationContract integrationContract = new IntegrationContract();
        integrationContract.setContractId("GET_HUGE_GOODS_INDO_LIST_CONTRACT_0001");
        integrationContract.setServiceCode("ACTIVITY_SHOW_GET_HUGE_GOODS_INDO_LIST");
        integrationContract.setSource("activity_show");

        integrationContractRepository.save(integrationContract);

        log.info("IntegrationContracts found with findAll():");
        log.info("-------------------------------");
        integrationContractRepository.findAll().forEach(e -> {
            log.info(e.toString());
        });
        log.info("");

    }

    public void setIntegrationContractRepository(IntegrationContractRepository integrationContractRepository) {
        this.integrationContractRepository = integrationContractRepository;
    }
}
