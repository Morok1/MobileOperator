package stubs;

import model.Option;

import java.util.ArrayList;
import java.util.List;

public class OptionStub  {
    /*private String name;
    private double cost;
    private double costOfConnection;*/

    public List<Option> init(){
        Option option = new Option();
        Option option1 = new Option();

        option.setCost(500);
        option.setCostOfConnection(3);
        option.setName("All inclusive");

        option1.setCost(500);
        option1.setCostOfConnection(2);
        option1.setName("All inclusive");

        List<Option> optionList = new ArrayList<>();
        optionList.add(option);
        optionList.add(option1);
        return optionList;
    }

}
