package repositoryImplementation;

import model.Client;
import repositoryInterface.ClientRepository;
import stubs.ClientStub;

import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {
    ClientStub clientStub = new ClientStub();

    @Override
    public Client getClientWithLastName(String lastName) {
        return clientStub.initOfOneClient();
    }

    @Override
    public List<Client> getAllClientsWithName(String name) {
        return clientStub.initOfListsClients();
    }
}
