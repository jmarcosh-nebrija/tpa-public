package nebrija.tpa.s5.ioc;


public class MotorElectrico implements Motor {
    @Override
    public void encender() {
        System.out.println("Motor electrico encendido.");
    }
}
