package flower.store;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tulip extends Flower {
    public Tulip() {
        this.setFlowerType(FlowerType.TULIP);
    }
}
