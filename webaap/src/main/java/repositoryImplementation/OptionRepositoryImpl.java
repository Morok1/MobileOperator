package main.java.repositoryImplementation;

import model.Option;
import repositoryInterface.OptionRepository;
import stubs.OptionStub;

import java.util.List;
import java.util.stream.Collectors;

public class OptionRepositoryImpl implements OptionRepository {
    OptionStub optionStub = new OptionStub();

    @Override
    public Option getOptionWithName(String name) {
        Option option = optionStub.init().stream().filter(s->s.getName().equals(name)).findFirst().get();
        return option;
    }

    @Override
    public List<Option> getOptionWithCostOverLimit(int limit) {
        List<Option> optionList = optionStub.init().stream().filter(s -> s.getCost() > limit)
                .collect(Collectors.toList());

        return optionList;
    }
}
