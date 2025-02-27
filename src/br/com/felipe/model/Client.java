package br.com.felipe.model;

public class Client {
    private final String name;
    private String city;
    private String region;
    private String phoneNumber; // Alterado para String
    private String cep; // Alterado para String
    private TypePlan typePlan; // Alterado para enum

    // Enum para representar o tipo de plano
    public enum TypePlan {
        BASIC, PREMIUM
    }

    // Construtor
    public Client(String name, String city, String region, String phoneNumber, String cep, TypePlan typePlan) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        this.city = city;
        this.region = region;
        this.phoneNumber = phoneNumber;
        this.cep = cep;
        this.typePlan = typePlan;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCep() {
        return cep;
    }

    public TypePlan getTypePlan() {
        return typePlan;
    }

    // Setters com validações básicas
    public void setCity(String city) {
        this.city = city;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10,11}")) { // Exemplo de validação simples
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    public void setCep(String cep) {
        if (cep == null || !cep.matches("\\d{8}")) { // Exemplo de validação simples
            throw new IllegalArgumentException("Invalid CEP");
        }
        this.cep = cep;
    }

    public void setTypePlan(TypePlan typePlan) {
        this.typePlan = typePlan;
    }

    // Sobrescrever toString()
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cep='" + cep + '\'' +
                ", typePlan=" + typePlan +
                '}';
    }
}