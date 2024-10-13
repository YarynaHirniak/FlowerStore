package flower.store;

import lombok.Getter;
import lombok.Setter;
/**
 * Represents a Chamomile flower.
 */
@Getter
@Setter
public class Chamomile extends Flower {
    /**
     * Constructor for Chamomile.
     * Sets the flower type to CHAMOMILE.
     */
    public Chamomile() {
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
}
