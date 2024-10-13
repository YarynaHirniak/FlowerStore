package flower.store;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a collection of FlowerPack instances in a flower store.
 */
public class FlowerBucket {
    /**
     * List<FlowerPack> flowerPacks
     */
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    /**
     * Adds a FlowerPack to the FlowerBucket.
     *
     * @param flowerPack the FlowerPack to add, should not be null.
     */
    public void add(final FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    /**
     * Calculates the total price of all FlowerPack
     *
     * @return the total price of all flower packs.
     */
    public double getPrice() {
        double totalPrice = 0.0;
        for (FlowerPack pack : flowerPacks) {
            totalPrice += pack.getPrice();
        }
        return totalPrice;
    }

    /**
     * Retrieves the list of FlowerPack instances in the FlowerBucket.
     *
     * @return the list of FlowerPack objects.
     */
    public List<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }
}
