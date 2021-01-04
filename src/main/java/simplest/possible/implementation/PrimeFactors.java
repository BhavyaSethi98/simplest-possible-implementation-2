package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> of(int number) {
        List<Integer> primeFactorsResult=new ArrayList<>();
        if (number==1)
            return primeFactorsResult;
        else
            primeFactorsResult.add(number);
        return primeFactorsResult;
    }
}
