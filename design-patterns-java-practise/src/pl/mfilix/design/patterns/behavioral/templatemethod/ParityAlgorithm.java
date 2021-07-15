package pl.mfilix.design.patterns.behavioral.templatemethod;

import java.util.List;
/* Class with the template method. */
public abstract class ParityAlgorithm implements I_NumberArray {

    protected NumberArray numArray;
    /* An abstract method to implement. */
    protected abstract List<Integer> findParity(NumberArray array);
    /* The template method. */
    public void parity(NumberArray array) {
        this.processArray();

        numArray.setList(this.findParity(array));

        SortAlgorithm ascending = new SortAscending();
        ascending.sort(numArray);

        numArray = ascending.getArray();
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
