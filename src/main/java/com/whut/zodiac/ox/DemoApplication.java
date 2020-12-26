package com.whut.zodiac.ox;

import com.whut.zodiac.ox.core.flux.model.mock.ConfigMetaDataMock;
import com.whut.zodiac.ox.core.flux.model.repository.persistence.IntegrationContractRepository;
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

            ConfigMetaDataMock configMetaDataMock = new ConfigMetaDataMock();
            configMetaDataMock.setIntegrationContractRepository(integrationContractRepository);
            configMetaDataMock.init();

        };
    }
}
