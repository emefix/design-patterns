package pl.mfilix.design.patterns.structural.facade;

import pl.mfilix.design.patterns.structural.decorator.I_Cloth;
import pl.mfilix.design.patterns.structural.decorator.Jeans;
import pl.mfilix.design.patterns.structural.decorator.Tshirt;

public class ClothMaker {

    private I_Cloth jeans;
    private I_Cloth tshirt;

    public ClothMaker() {
        jeans = new Jeans();
        tshirt = new Tshirt();
    }

    public void sewJeans() {
        jeans.sew();
    }

    public void sewTshirt() {
        tshirt.sew();
    }
}
