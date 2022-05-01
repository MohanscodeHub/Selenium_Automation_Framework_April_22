package com.clipboard.config;

import org.aeonbits.owner.*;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
