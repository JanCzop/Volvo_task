package com.example.volvotask;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "countries")
public class Country_DTO {
    @Id
    private String code;
    private String common_name;
    private String official_name;
    @ElementCollection
    private List<String> currencies;
    @ElementCollection
    private List<String> capital;
    private String region;
    private String subregion;
    @ElementCollection
    private List<String> languages;
    private long population;
    @ElementCollection
    private List<String> borders;
    @ElementCollection
    private List<String> timezones;

    @Override
    public String toString() {
        return "Country_DTO{" +
                "code='" + code + '\'' +
                ", common_name='" + common_name + '\'' +
                ", official_name='" + official_name + '\'' +
                ", currencies=" + currencies +
                ", capital=" + capital +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", languages=" + languages +
                ", population=" + population +
                ", borders=" + borders +
                ", timezones=" + timezones +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
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

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
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
