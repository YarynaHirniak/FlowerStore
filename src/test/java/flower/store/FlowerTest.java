package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

/**
 * Unit tests for the Flower class.
 */
public class FlowerTest {
    /**
     * private static final Random RANDOM_GENERATOR
     */
    private static final Random RANDOM_GENERATOR = new Random();
    /**
     * private static final int MAX_PRICE
     */
    private static final int MAX_PRICE = 100;
    /**
     * Flower flower;
     */
    private Flower flower;

    /**
     * Initializes a new Flower instance before each test.
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    /**
     * Tests the price setting and getting of a flower.
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    /**
     * Tests the color setting and getting of a flower.
     */
    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor().toString());
    }
}
