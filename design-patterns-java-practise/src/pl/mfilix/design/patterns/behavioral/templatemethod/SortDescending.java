package pl.mfilix.design.patterns.behavioral.templatemethod;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending extends SortAlgorithm {

    @Override
    protected List<Integer> compare(NumberArray array) {

        return array.getList()
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Sorted descending " + numArray;
    }
}
