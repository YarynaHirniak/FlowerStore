package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

/**
 * Unit tests for the FlowerBucket class.
 */
public class FlowerBucketTest {
    /**
     * private static final Random RANDOM_GENERATOR
     */
    private static final Random RANDOM_GENERATOR = new Random();
    /**
     * MAX_QUANTITY = 1000
     */
    private static final int MAX_QUANTITY = 1000;
    /**
     *  MAX_PRICE = 100;
     */
    private static final int MAX_PRICE = 100;
    /**
     * private static final int TEST_PRICE = 10;
     */
    private static final int TEST_PRICE = 10;
    /**
     * FlowerBucket flowerBucket;
     */
    private FlowerBucket flowerBucket;

    /**
     * Initializes a new FlowerBucket instance before each test.
     */
    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    /**
     * Tests the price calculation for a FlowerBucket.
     */
    @Test
    public void testPrice() {
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(TEST_PRICE);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        int expectedPrice = TEST_PRICE * quantity;
        Assertions.assertEquals(expectedPrice, flowerBucket.getPrice());
    }

}
