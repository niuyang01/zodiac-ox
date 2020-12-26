package com.whut.zodiac.ox.core.flux.model.repository.domain;

import com.whut.zodiac.ox.core.flux.model.entity.domain.IntegrationContractModel;

public interface IntegrationContractModelRepository {

    IntegrationContractModel load(String contractId);

}
