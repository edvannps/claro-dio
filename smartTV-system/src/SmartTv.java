public class SmartTv {
    boolean connected = false;
    int channel = 1;
    int volume = 25;

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel--;
    }

    public void increaseVolume(){
        if(volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume(){
        if(volume > 0) {
            volume--;
        }
    }

    public void turnOn() {
        connected = true;
    }

    public void turnOff() {
        connected = false;
    }
}
