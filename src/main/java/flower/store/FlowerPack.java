package flower.store;

/**
 * Class representing a pack of flowers.
 */
public class FlowerPack {
    private Flower flower;
    private int quantity;

    /**
     * Constructor for FlowerPack.
     *
     * @param flower  The flower to be included in the pack; should not be null.
     * @param quantity The quantity of the flower in the pack; should be a positive integer.
     */
    public FlowerPack(final Flower flower, final int quantity) {
        this.flower = flower;
        this.quantity = quantity;
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
