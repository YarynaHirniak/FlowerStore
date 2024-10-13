package flower.store;

/**
 * Class representing a pack of flowers.
 */
public class FlowerPack {
    /**
     * flower;
     */
    private Flower flower;
    /**
     * The quantity of flowers.
     */
    private int quantity;

    /**
     * Constructor for FlowerPack.
     *
     * @param flower  The flower to be included in the pack.
     * @param quantity The quantity of the flower in the pack.
     */
    public FlowerPack(final Flower flowerInstance, final int flowerQuantity) {
        this.flower = flowerInstance;
        this.quantity = flowerQuantity;
    }

    /**
     * Calculates the total price of the flower pack.
     *
     * @return The total price of the pack.
     */
    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    /**
     * Retrieves the flower in the pack.
     *
     * @return The flower in the pack.
     */
    public Flower getFlower() {
        return flower;
    }
}
