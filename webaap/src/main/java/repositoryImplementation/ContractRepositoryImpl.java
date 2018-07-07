package main.java.repositoryImplementation;

import model.Contract;
import repositoryInterface.ContractRepository;
import stubs.ContractStub;


public class ContractRepositoryImpl implements ContractRepository {
    @Override
    public Contract getContractWithNumber(int number) {
        ContractStub contractStub = new ContractStub();
        Contract contract = contractStub.init();
//       TODO: consider use optinanl  frameworkE
        if(contract.getNumber() == number){
            return contract;
        }
        return null ;
    }
}
