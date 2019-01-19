package jan_19.chapter_19.generic.page_741;

import java.util.ArrayList;
import java.util.List;

public class Bosta {

    private final int serial;
    private final String weight;

    public List<Bosta> bostaList = new ArrayList<>();

    public Bosta(int serial, String weight) {
        this.serial = serial;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bosta{" + "serial=" + serial + ", weight=" + weight + '}';
    }

    public int getSize() {
        return bostaList.size();
    }

    public Bosta peek() {
        return bostaList.get(getSize() - 1);
    }

    public void push(Bosta o) {
        bostaList.add(o);
    }

    public Bosta pop() {
        Bosta o = bostaList.get(getSize() - 1);
        bostaList.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return bostaList.isEmpty();
    }
}
