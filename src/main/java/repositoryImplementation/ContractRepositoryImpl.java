package repositoryImplementation;

import model.Contract;
import repositoryInterface.ContractRepository;
import stubs.ContractStub;

import java.util.List;

public class ContractRepositoryImpl implements ContractRepository {

    @Override
    public Contract getContractWithNumber(int number) {
        ContractStub contractStub = new ContractStub();
        List<Contract> contractList = contractStub.init();
        cont
        return null;
    }
}
