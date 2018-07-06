package service;

import model.Option;
import org.apache.log4j.Logger;
import repositoryImplementation.OptionRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class OptionService {
    private static Logger logger = Logger.getLogger(OptionService.class);
    private OptionRepositoryImpl optionRepository = new OptionRepositoryImpl();

    public Option getOptionWithName(String name) {
        logger.info(name);
        return optionRepository.getOptionWithName(name);
    }

    public List<Option> getOptionWithCostOverLimit(int limit) {
        logger.info(limit);
        return optionRepository.getOptionWithCostOverLimit(limit);
    }
}
