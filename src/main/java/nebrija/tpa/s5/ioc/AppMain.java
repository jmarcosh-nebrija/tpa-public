package nebrija.tpa.s5.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        // Cargar el contexto desde el archivo XML
        ApplicationContext context =
                new ClassPathXmlApplicationContext("cocheAppContext.xml");

        // Obtener el bean Coche desde el contexto
        Coche coche = (Coche) context.getBean("coche");

        // Usar el bean
        coche.arrancar();
    }
}