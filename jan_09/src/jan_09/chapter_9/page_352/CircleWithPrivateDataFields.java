
package jan_09.chapter_9.page_352;

class CircleWithPrivateDataFields {

    double radius;

    CircleWithPrivateDataFields(double d) {
        radius = d;
    }

    public double getArea() {
        return Math.pow(radius, 2) * 3.1416;
    }

    public double getRadius() {
        return radius;
    }

}
