package pl.mfilix.design.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Additives {

    private List<String> additives;

    public Additives() {
        additives = new ArrayList<String>();
    }

    public List<String> getAdditives() {
        return additives;
    }

    public void setAdditives(List<String> additives) {
        this.additives = additives;
    }

    public void addAdditive(String additive) {
        additives.add(additive);
    }

    public String toString() {
        return additives.stream().collect(Collectors.joining(" and ")).toString();
    }
}
