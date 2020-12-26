package com.whut.zodiac.ox.core.flux.boot;

import com.whut.zodiac.ox.core.flux.model.manager.ConfigModelCacheManager;
import com.whut.zodiac.ox.core.flux.model.mock.ConfigMetaDataMock;

public class BeforeServiceStartup {

    private ConfigMetaDataMock      configMetaDataMock;

    private ConfigModelCacheManager configModelCacheManager;

    public void before() {

        // mock配置元数据
        configMetaDataMock.init();

        // 加载配置模型
        configModelCacheManager.loadAllConfigModelCache();

    }

    public void setConfigModelCacheManager(ConfigModelCacheManager configModelCacheManager) {
        this.configModelCacheManager = configModelCacheManager;
    }

}
