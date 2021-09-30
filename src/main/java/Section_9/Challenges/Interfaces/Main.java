package Section_9.Challenges.Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone dimasPhone;
        dimasPhone = new DeskPhone(12345);
        dimasPhone.powerOn();
        dimasPhone.callPhone(12345);
        dimasPhone.answer();

        dimasPhone = new MobilePhone(24567);
        dimasPhone.powerOn();
        dimasPhone.callPhone(24567);
        dimasPhone.answer();
    }
}
