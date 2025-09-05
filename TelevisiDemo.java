public class TelevisiDemo {
    public static void main(String[] args) {
        Televisi tv1 = new Televisi();
        tv1.merk = "Samsung";
        tv1.ukuranLayar = 42;
        tv1.volume = 25;
        tv1.channel = 5;
        tv1.volume = 30;

        tv1.pindahChannel(12);
        tv1.displayInfo();
        tv1.naikkanVolume();
        tv1.turunkanVolume();

        Televisi tv2 = new Televisi();
        tv2.merk = "Polytron";
        tv2.ukuranLayar = 32;
        tv2.volume = 40;
        tv2.channel = 7;
        tv2.volume = 45;

        tv2.pindahChannel(21);
        tv2.displayInfo();
        tv2.naikkanVolume();
        tv2.turunkanVolume();
    }
}