
public class User {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();



        System.out.println("TV Ligada? " + smartTv.connected);
        System.out.println("Canal atual? " + smartTv.channel);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.changeChannel(15);
        System.out.println("Canal atual? " + smartTv.channel);
        smartTv.turnOn();
        System.out.println("Novo status -> TV Ligada? " + smartTv.connected);
    }
}
