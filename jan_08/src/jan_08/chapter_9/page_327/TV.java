package jan_08.chapter_9.page_327;

public class TV {

    int channel = 1;
    int volLevel = 1;
    boolean on = false;

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 1 && newVolume <= 7) {
            volLevel = newVolume;
        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void volumeUp() {
        if (on && volLevel < 7) {
            volLevel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    public void volumeDown() {
        if (on && volLevel > 1) {
            volLevel--;
        }
    }
}
