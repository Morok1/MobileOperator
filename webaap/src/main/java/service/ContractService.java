package main.java.service;

import model.Contract;
import org.apache.log4j.Logger;
import repositoryImplementation.ContractRepositoryImpl;


public class ContractService  {
    private ContractRepositoryImpl contractRepository;
    private static Logger logger = Logger.getLogger(ContractService.class);

    public Contract getContractWithNumber(int number) {
        logger.info("Start function:" + "getContractWithNumber");
        return contractRepository.getContractWithNumber(number);
    }
}
