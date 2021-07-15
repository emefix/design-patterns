package pl.mfilix.design.patterns.behavioral.templatemethod;

import java.util.List;
/* Class with the template method. */
public abstract class SortAlgorithm implements I_NumberArray {

    protected NumberArray numArray;
    /* An abstract method to implement. */
    protected abstract List<Integer> compare(NumberArray array);
    /* The template method. */
    public void sort(NumberArray array) {
        this.processArray();
        numArray.setList(this.compare(array));
    }

    @Override
    public void processArray() {
        numArray = new NumberArray();
    }

    @Override
    public NumberArray getArray() {
        return numArray;
    }
}
