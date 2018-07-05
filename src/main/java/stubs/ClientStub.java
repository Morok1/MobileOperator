package stubs;

import model.Client;

import java.util.Date;

public class ClientStub {
    /*
    *
    * private String name;
    private String lastName;
    private Date birthDay;
    //TODO Consider format of passport data(may be regular expression)
    private String passportData;
    //TODO consider format of address
    private String address;

    private List<Contract> contractList;
    //TODO consider format or validator
    private String email;
    private String password;

    * */
    Client client = new Client();
    public Client initOfOneClient(){
        client.setName("Vasya");
        client.setLastName("Petrov");
        client.setBirthDay(new Date(44444444));
        client.setAddress("Moscow");
        client.setEmail("ui@mail.ru");
        return  client;
    }
}
