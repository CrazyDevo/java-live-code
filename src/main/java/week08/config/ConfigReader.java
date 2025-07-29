package week08.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;


@Config.Sources("classpath:config.properties")
public interface ConfigReader extends Config {

    @Key("browser")
    String browser();

    @Key("url")
    String url();

    @Key("username")
    String username();


    @Key("password")
    String password();

    @Key("api")
    String api();


  ConfigReader CONFIGREADER=  ConfigFactory.create(ConfigReader.class);


}
