package jan_17.chapter_13.page_506;

import javafx.scene.control.TreeItem;

class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        return "Chicken: Fry it ! ";
    }

    @Override
    public String howToEat() {
        return "Chicken: Cock-a-doodle-doo";
    }
}
