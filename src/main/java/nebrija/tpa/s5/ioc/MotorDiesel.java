package nebrija.tpa.s5.ioc;


public class MotorDiesel implements Motor {
    @Override
    public void encender() {
        System.out.println("Motor diesel encendido.");
    }
}
