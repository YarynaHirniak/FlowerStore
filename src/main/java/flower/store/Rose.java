package flower.store;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Rose flower, which is a type of Flower.
 */
@Getter
@Setter
public class Rose extends Flower {
    /**
     * Constructor that sets the flower type to ROSE.
     */
    public Rose() {
        this.setFlowerType(FlowerType.ROSE);
    }
}
