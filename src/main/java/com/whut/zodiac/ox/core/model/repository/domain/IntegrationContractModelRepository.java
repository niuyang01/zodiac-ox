package com.whut.zodiac.ox.core.model.repository.domain;

import com.whut.zodiac.ox.core.model.entity.domain.IntegrationContractModel;

public interface IntegrationContractModelRepository {

    IntegrationContractModel load(String contractId);

}
