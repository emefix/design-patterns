package pl.mfilix.design.patterns.behavioral.templatemethod;

import java.util.List;
import java.util.stream.Collectors;

public class SortAscending extends SortAlgorithm {

    @Override
    protected List<Integer> compare(NumberArray array) {

        return array.getList()
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Sorted ascending " + numArray;
    }
}
