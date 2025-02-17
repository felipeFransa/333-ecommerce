package br.com.felipe.model;

public class Client {
    private String name;
    private String city;
    private String region;
    private Integer phoneNumber;
    private Integer cep;
    private Boolean typePlan;

    public Boolean getTypePlan() {
        return typePlan;
    }

    public void setTypePlan(Boolean typePlan) {
        this.typePlan = typePlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }
}
