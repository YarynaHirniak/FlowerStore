package flower.store;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a flower with attributes like sepal length, color, price, and type.
 */
@Setter
public class Flower {
    @Getter
    private double sepalLength;

    private FlowerColor color;

    @Getter
    private double price;

    @Getter
    private FlowerType flowerType;

    /**
     * Gets the color of the flower as a string.
     * 
     * @return the color of the flower.
     */
    public String getColor() {
        return color.toString();
    }

    /**
     * Sets the price of the flower.
     * 
     * @param newPrice the new price to set, should be a non-negative value.
     */
    public void setPrice(final double newPrice) {
        this.price = newPrice;
    }

    /**
     * Gets the price of the flower.
     * 
     * @return the price of the flower.
     */
    public double getPrice() {
        return price;
    }
}
