package repositoryImplementation;

import model.Option;
import repositoryInterface.OptionRepository;
import stubs.OptionStub;

import java.util.List;

public class OptionRepositoryImpl implements OptionRepository {
    OptionStub optionStub = new OptionStub();

    @Override
    public Option getOptionWithName(String name) {
        return null;
    }

    @Override
    public List<Option> getOptionWithCostOverLimit(int limit) {
        return null;
    }
}
