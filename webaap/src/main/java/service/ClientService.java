package main.java.service;

import model.Client;
import org.apache.log4j.Logger;
import repositoryImplementation.ClientRepositoryImpl;

import java.util.List;

public class ClientService {
    ClientRepositoryImpl clientRepositoryImpl = new ClientRepositoryImpl();
    private static Logger logger = Logger.getLogger(ClientService.class);
    public Client getClientWithLastName(String lastName) {
        logger.info("Start" + " getClientWithLastName function");
        return clientRepositoryImpl.getClientWithLastName(lastName);

    }

    public List<Client> getAllClientsWithName(String name) {
        logger.info("Start" + " getClientWithLastName function");
        return clientRepositoryImpl.getAllClientsWithName(name);
    }

}
