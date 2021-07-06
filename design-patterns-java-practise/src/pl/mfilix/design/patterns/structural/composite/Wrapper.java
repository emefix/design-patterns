package pl.mfilix.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Wrapper implements I_Composite {

    private List<I_Composite> contents;

    public Wrapper() {
        contents = new ArrayList<>();
    }

    public Wrapper(I_Composite c) {
        contents = new ArrayList<>();
        contents.add(c);
    }

    public Wrapper(List<I_Composite> l) {
        contents = l;
    }

    public void add(I_Composite c) {
        contents.add(c);
    }

    public void remove(I_Composite c) {
        contents.remove(c);
    }

    public List<I_Composite> getContents() {
        return contents;
    }

    public String toString() {
        return contents.stream().map(I_Composite::name).collect(Collectors.joining(", "));
    }

    @Override
    public String name() {
        return "wrapper = {" + this + "}";
    }

    @Override
    public float price() {
        return contents.stream().map(I_Composite::price).reduce(0F, Float::sum);
    }
}
