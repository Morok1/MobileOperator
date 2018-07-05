package repositoryImplementation;

import model.Rate;
import repositoryInterface.RateRepository;
import stubs.RateStub;

public class RateRepositoryImpl implements RateRepository {
    @Override
    public Rate getContractWithName(String name) {
        RateStub rateStub = new RateStub();
        Rate rate = rateStub.init().stream().filter(s -> s.getName().equals(name)).findFirst().get();
        return rate;
    }
}
