package stubs;

import model.Contract;

import java.util.ArrayList;
import java.util.List;

public class ContractStub {

    public ContractStub() {}

    public Contract init(){
        Contract contract = new Contract();
        Contract contract1 = new Contract();

        contract.setNumber(1);
        contract1.setNumber(2);

        List<Contract> contractList = new ArrayList<Contract>();
        contractList.add(contract);
        contractList.add(contract1);
        Contract contract2 = getContract(contractList);

        return  contract2;
    }

    Contract getContract(List<Contract> contractList) {
        return contractList.stream().filter(s -> s.getNumber() == 2).findFirst().get();
    }

}
