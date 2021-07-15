package pl.mfilix.design.patterns.behavioral.templatemethod;

public class TemplateMethodPatternDemo {

    public static void main(String[] args) {

        NumberArray numbers = new NumberArray(10, 20, 100);
        System.out.println(numbers);

        ParityAlgorithm odd = new OddParity();
        odd.parity(numbers);
        System.out.println(odd);

        ParityAlgorithm even = new EvenParity();
        even.parity(numbers);
        System.out.println(even);
    }
}
