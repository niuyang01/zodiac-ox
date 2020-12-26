package com.whut.zodiac.ox.core.flux.model.entity.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InteractionConfig {

    // 交互配置id
    @Id
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
