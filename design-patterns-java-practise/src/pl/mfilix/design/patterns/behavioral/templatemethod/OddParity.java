package pl.mfilix.design.patterns.behavioral.templatemethod;

import java.util.List;
import java.util.stream.Collectors;

public class OddParity extends ParityAlgorithm {

    @Override
    protected List<Integer> findParity(NumberArray array) {

        return array.getList()
                .stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Odd " + numArray;
    }
}
