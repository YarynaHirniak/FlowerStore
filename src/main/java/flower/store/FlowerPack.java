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
     * quantity;
     */
    private int quantity;

    /**
     * Constructor for FlowerPack.
     *
     * @param flower  The flower to be included in the pack; should not be null.
     * @param quantity The quantity of the flower in the pack.
     */
    public FlowerPack(final Flower n_flower, final int n_quantity) {
        this.flower = n_flower;
        this.quantity = n_quantity;
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
