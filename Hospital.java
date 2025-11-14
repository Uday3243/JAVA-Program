//4.DOCTOR FEES
class Doctor {
    void consultationFee() {
        System.out.println("Doctor consultation fee: $50");
    }
}

class Dentist extends Doctor {
    void consultationFee() {
        System.out.println("Dentist consultation fee: $80");
    }
}

class Cardiologist extends Doctor {
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: $120");
    }
}

class Surgeon extends Doctor {
    void consultationFee() {
        System.out.println("Surgeon consultation fee: $200");
    }
}

public class Hospital {
    public static void main(String[] args) {
        Dentist d = new Dentist();
        Cardiologist c = new Cardiologist();
        Surgeon s = new Surgeon();

        d.consultationFee();
        c.consultationFee();
        s.consultationFee();
    }
}
