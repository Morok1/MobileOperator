package stubs;

import model.Client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public Client initOfOneClient(){
        Client client = new Client();
        String name = "Vasya";
        setProperties(client, name);
        return  client;
    }

    public List<Client> initOfListsClients(){
        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        Client client = new Client();

        String name = "Vasya";
        String name1 = "Petya1";
        String name2 = "Petya2";
        String name3 = "Petya3";

        setProperties(client, name);
        setProperties(client1, name1);
        setProperties(client2, name2);
        setProperties(client3, name3);

        List<Client> clientList = new ArrayList<Client>();

        clientList.add(client);
        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);
        return null;
    }


    void setProperties(Client client, String name) {
        client.setName(name);
        client.setLastName("Petrov");
        client.setBirthDay(new Date(44444444));
        client.setAddress("Moscow");
        client.setEmail("ui@mail.ru");
    }

}
