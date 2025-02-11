package br.com.felipe.main;

import br.com.felipe.model.Client;

public class MainClient {
    public static void main(String[] args) {
        Client client = new Client();

        client.setFirstName("");
        client.setCep(32314);
        client.setPhoneNumber(31971389);
        client.setCity("");
        client.setRegion("");
        client.setTypePlan(true);

        if (client.getTypePlan()){
            System.out.println(client.getCep());
        }
    }
}
