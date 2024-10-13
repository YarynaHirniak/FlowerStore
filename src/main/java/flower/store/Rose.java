package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rose extends Flower {
    public Rose() {
        this.setFlowerType(FlowerType.ROSE);
    }
}