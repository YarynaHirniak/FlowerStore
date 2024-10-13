package flower.store;

/**
 * Enum representing different colors of flowers.
 */
public enum FlowerColor {
    /**
     * Color red with its hexadecimal representation.
     */
    RED("#FF0000"),

    /**
     * Color blue with its hexadecimal representation.
     */
    BLUE("#0000FF");
    /**
     * private final String stringRepresentation.
     */
    private final String stringRepresentation;

    /**
     * Constructor for FlowerColor enum.
     *
     * @param colorRepresentation the string representation of the color.
     */
    FlowerColor(final String colorRepresentation) {
        this.stringRepresentation = colorRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}

