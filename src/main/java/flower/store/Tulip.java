package flower.store;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Tulip flower.
 */
@Getter
@Setter
public class Tulip extends Flower {

    /**
     * Constructs a new Tulip flower with its type set to TULIP.
     */
    public Tulip() {
        this.setFlowerType(FlowerType.TULIP);
    }
}
