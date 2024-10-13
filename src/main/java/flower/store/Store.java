package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a store that contains multiple flower buckets.
 */
public class Store {
    /**
     * List<FlowerBucket> buckets
     */
    private List<FlowerBucket> buckets = new ArrayList<>();

    /**
     * Adds a new flower bucket to the store.
     *
     * @param bucket the flower bucket to add; should not be null
     */
    public void addBucket(final FlowerBucket bucket) {
        buckets.add(bucket);
    }

    /**
     * Searches for flower buckets that contain a specific type of flower.
     *
     * @param flowerType the type of flower to search for; should not be null
     * @return a list of flower buckets containing the specified flower type
     */
    public List<FlowerBucket> search(final FlowerType flowerType) {
        return buckets.stream()
                .filter(bucket -> bucket.getFlowerPacks().stream()
                    .anyMatch(p -> p.getFlower().getFlowerType() == flowerType))
                .collect(Collectors.toList());
    }
}
