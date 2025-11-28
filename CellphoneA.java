class Cellphone{
    void ring() {
        System.out.println("Phone is ringing...");
    }

    void vibrate() {
        System.out.println("Phone vibrating...");
    }

    void callFriend() {
        System.out.println("calling my friend...");
    }
}

public class CellphoneA {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        phone.ring();
        phone.vibrate();
        phone.callFriend();
    }
}
