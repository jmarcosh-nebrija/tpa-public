package nebrija.tpa.s5.ioc;

public class CocheGasolina implements Coche {
    private Motor motor;

    // Spring usa Setter Injection
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void arrancar() {
        System.out.println("Coche arrancando...");
        motor.encender();
    }
}

