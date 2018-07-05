package repositoryInterface;

import model.Option;

import java.util.List;

public interface OptionRepository {
    Option getOptionWithName(String name);
    List<Option> getOptionWithCostOverLimit(int limit);
}
