package main.java.repositoryInterface;


import model.Rate;

public interface RateRepository {
    Rate getContractWithName(String name);
}
