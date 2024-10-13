package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private List<FlowerBucket> buckets = new ArrayList<>();

    public void addBucket(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public List<FlowerBucket> search(FlowerType flowerType) {
        return buckets.stream()
                .filter(bucket -> bucket.getFlowerPacks().stream()
                    .anyMatch(pack -> pack.getFlower().getFlowerType() == flowerType))
                .collect(Collectors.toList());
    }
}
