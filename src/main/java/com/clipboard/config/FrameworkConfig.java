package com.clipboard.config;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/test/resources/Config/config.properties")
public interface FrameworkConfig extends Config {
    @Key("url")
    String url ();

}
