package main.java.repositoryInterface;

import model.Client;

import java.util.List;

public interface ClientRepository extends ModelRepository {
     Client getClientWithLastName(String lastName);
     List<Client> getAllClientsWithName(String name);
}
