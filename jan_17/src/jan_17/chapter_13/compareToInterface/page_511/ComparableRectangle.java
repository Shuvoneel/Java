package jan_17.chapter_13.compareToInterface.page_511;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " area: " + getArea();
    }

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }
    
}
