package com.whut.zodiac.ox;

import com.whut.zodiac.ox.core.model.entity.persistence.IntegrationContract;
import com.whut.zodiac.ox.core.model.repository.persistence.IntegrationContractRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(IntegrationContractRepository integrationContractRepository) {

        return (args) -> {

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

        };
    }
}
