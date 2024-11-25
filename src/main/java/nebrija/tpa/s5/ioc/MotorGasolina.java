package nebrija.tpa.s5.ioc;


public class MotorGasolina implements Motor {
    @Override
    public void encender() {
        System.out.println("Motor de gasolina encendido.");
    }
}
