package flower.store;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chamomile extends Flower {
    public Chamomile() {
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
}