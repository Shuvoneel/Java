package jan_08.chapter_9.page_327;

public class TestTV {

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(18);
        tv1.setVolume(7);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volLevel);
    }

}
