package com.example.volvotask;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Country_data {
    @JsonProperty("cca3")
    private String code;
    @JsonProperty("name")
    private Name_country name;
    @JsonProperty("currencies")
    private Map<String,Currency> currencies;
    @JsonProperty("capital")
    private List<String> capital;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("languages")
    private Map<String,String> languages;
    @JsonProperty("population")
    private long population;
    @JsonProperty("borders")
    private List<String> borders;
    @JsonProperty("timezones")
    private List<String> timezones;

    @Override
    public String toString() {
        return "Country_data{" +
                "code='" + code + '\'' +
                ", name=" + name +
                ", currency=" + currencies +
                ", capital=" + capital +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", languages=" + languages +
                ", population=" + population +
                ", borders=" + borders +
                ", timezones=" + timezones +
                '}';
    }

    public static class Name_country{

        @JsonProperty("common")
        private String common_name;
        @JsonProperty("official")

        private String official_name;

        @Override
        public String toString() {
            return "Name{" +
                    "common_name='" + common_name + '\'' +
                    ", official_name='" + official_name + '\'' +
                    '}';
        }

        public String getCommon_name() {
            return common_name;
        }

        public void setCommon_name(String common_name) {
            this.common_name = common_name;
        }

        public String getOfficial_name() {
            return official_name;
        }

        public void setOfficial_name(String official_name) {
            this.official_name = official_name;
        }
    }
    public static class Currency{
        @JsonProperty("name")

        private String currency_name;
        //private String symbol;

        @Override
        public String toString() {
            return "Currency{" +
                    "name='" + currency_name + '\'' +
              //      ", symbol='" + symbol + '\'' +
                    '}';
        }

        public String getName() {
            return currency_name;
        }

        public void setName(String name) {
            this.currency_name = name;
        }
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Name_country getName() {
        return name;
    }

    public void setName(Name_country name) {
        this.name = name;
    }

    public Map<String, Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<String, Currency> currencies) {
        this.currencies = currencies;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }
}
