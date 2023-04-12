import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

public class Principal {
    public static void main(String[] args) {

        Triangulo t = new Triangulo(3,4);
        Quadrado q = new Quadrado(4,5);
        t.calcularArea();
        q.calcularArea();
        System.out.println("Area do Quadrado " +q.calcularArea());
        System.out.println("Area do triangulo " +t.calcularArea());
        System.out.println("Perimetro do quadrado " +q.calcularperimetro());
        System.out.println("Perimetro do triangulo " +t.calcularperimetro());


}}
