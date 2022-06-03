import modelo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Categoria cat=new Categoria("Novela","Categoria de novela");
        Categoria catScifi=new Categoria("Sciencia ficción","Categoria de sci-fi");


        Libro li=new Libro();
        li.setTitulo("Harry Potter");
        li.setAutor("JRW");
        li.setPrecio(500);
        li.setCat(cat);

        // control-q
        Libro li2=new Libro("Harry Potter","JRW",500);
        li2.setCat(cat);


        Libro li3=new Libro("Harry Potter","JRW");
        li3.setCat(catScifi);


        Libro li4=new Libro("Harry potter","JRW",500,cat);

        Libro li5=new Libro();
        li5.setTitulo("Harry Potter");
        li5.setAutor("JRW");
        li5.setPrecio(500);
        li5.setCat( new Categoria("Comedia","Categoria de comedia") );

        System.out.println("el libro #5 es "+li5.getTitulo());

        // alt+enter = agregar un import
        // control+q = informacion de donde esta el cursor.
        // control+espacio = fuerzo el autocompletar
        // control+click boton = voy a la definicion

        // automovil
        MarcaVehiculo peugeot=new MarcaVehiculo();
        peugeot.setNombre("Peugeot");

        Automovil auto1=new Automovil();

        auto1.setMarca(peugeot);
        auto1.setDueno("John doe");
        auto1.setPatente("aa-bb55");

        System.out.println("------");
        System.out.println("Dueño : "+auto1.getDueno());
        System.out.println("Patente: "+auto1.getPatente());
        System.out.println("Marcar: "+auto1.getMarca().getNombre());

        List<Caracteristica> caracts=new ArrayList<>();
        caracts.add(new Caracteristica("amarillo"));
        caracts.add(new Caracteristica("4 puertas"));
        caracts.add(new Caracteristica("sedan"));

        auto1.setCaracteristicas(caracts);

        for (Caracteristica carac :auto1.getCaracteristicas()) {
            System.out.println("caracteristica: "+carac.getNombre());
        }


    }
}