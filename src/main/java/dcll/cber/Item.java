package dcll.cber;

/**
 * Created by Camy on 14/04/2016.
 */
public class Item {

    private Object value;

    public Item(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
