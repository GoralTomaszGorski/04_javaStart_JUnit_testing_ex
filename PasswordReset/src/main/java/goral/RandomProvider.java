package goral;

import java.util.Random;
import java.util.UUID;

public class RandomProvider {

    public String passwordGenerator(){
        return UUID.randomUUID().toString();
    }
}
