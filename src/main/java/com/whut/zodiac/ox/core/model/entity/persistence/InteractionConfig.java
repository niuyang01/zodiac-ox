package com.whut.zodiac.ox.core.model.entity.persistence;

public class InteractionConfig {

    // 交互配置id
    private String id;

    // 交互配置模板
    private String interactionConfigTemplate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInteractionConfigTemplate() {
        return interactionConfigTemplate;
    }

    public void setInteractionConfigTemplate(String interactionConfigTemplate) {
        this.interactionConfigTemplate = interactionConfigTemplate;
    }
}
