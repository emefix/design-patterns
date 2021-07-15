package pl.mfilix.design.patterns.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class NumberArray {

    private List<Integer> list;

    public NumberArray() {
    }

    public NumberArray(int size, int lowerbound, int upperbound) {

        Random rand = new Random();

        list = new ArrayList<>();

        int num;
        for(int i = 0; i < size; i++) {
            do {
                num = rand.nextInt(upperbound);
            } while(num <= lowerbound);
            list.add(num);
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void addNumber(Integer num) {
        list.add(num);
    }

    public void removeNumber(Integer num) {
        list.remove(num);
    }

    @Override
    public String toString() {
        return "numbers = \n\t{" +
                list.stream().map(Object::toString).collect(Collectors.joining(", ")) +
                '}';
    }
}
