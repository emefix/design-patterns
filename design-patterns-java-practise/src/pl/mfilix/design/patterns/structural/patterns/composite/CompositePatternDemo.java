package pl.mfilix.design.patterns.structural.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositePatternDemo {

    public static void main(String[] args) {

        Wrapper parcel = new Wrapper();

        Wrapper cosmetics = new Wrapper();
        cosmetics.add(new Powder());
        cosmetics.add(new Wrapper(new ArrayList<I_Composite>(Arrays.asList(
                new Mascara(), new Mascara()))));

        parcel.add(cosmetics);
        parcel.add(new Glasses());

        System.out.println("Content of parcel:\n" + parcel);
        System.out.println();
        System.out.printf("Total price = %.2f zł", parcel.price());
    }
}
