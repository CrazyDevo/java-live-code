package week08;

import week08.config.ConfigReader;

public class TestDependency {

    public static void main(String[] args) {

        System.out.println(ConfigReader.CONFIGREADER.api());
        System.out.println(ConfigReader.CONFIGREADER.username());


    }
}
