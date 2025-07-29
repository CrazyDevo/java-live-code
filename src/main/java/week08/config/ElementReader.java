package week08.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;


@Config.Sources("classpath:elements.properties")
public interface ElementReader extends Config {

    @Key("dashboard")
    String dashboard();

  ElementReader CONFIGREADER=  ConfigFactory.create(ElementReader.class);


}
