public class Televisi {
    public String merk;
    public int ukuranlayar;
    public int volume;
    public int channel;

    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran: " + ukuranlayar + " inch");
        System.out.println("Volume saat ini: " + volume);
        System.out.println("Channel saat ini: " + channel);
    }
    public void naikkanVolume() {
        if (volume < 100) {
            volume += 5;
        }
    }
    public void turunkanVolume() {
        if (volume > 0) {
            volume -= 5;
        }
    }
    public void pindahChannel(int channelBaru) {
        if (channelBaru >= 1 && channelBaru <= 30) {
            channel = channelBaru;
            System.out.println("Berhasil pindah ke channel " + channel);
        } else {
            System.out.println("Channel tidak tersedia.");
        }
    }
}