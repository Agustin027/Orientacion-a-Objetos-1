import java.util.ArrayList;
import java.util.List;

public class Farola {
    private boolean isOn;
    private List<Farola> neighbors;

    public Farola() {
        this.isOn = false;
        neighbors = new ArrayList<Farola>();
    }

    public List<Farola> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Farola> neighbors) {
        this.neighbors = neighbors;
    }

    public boolean isOn() {
        return isOn;
    }
    public boolean isOff() {
        return !isOn;
    }

    public void pairWithNeighbor(Farola f) {
        if(!neighbors.contains(f)) {
            neighbors.add(f);
            f.pairWithNeighbor(this);
        }
    }
    public void turnOn() {
       if (!isOn) {
            isOn = true;
            for (Farola f : neighbors) {
                f.turnOn();
            }
        }
    }
    public void turnOff() {
        if (isOn) {
            isOn = false;
            for (Farola f : neighbors) {
                f.turnOff();
            }
        }
    }

}
