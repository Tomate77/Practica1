import java.util.List;

public class Interfaz {
    public static void imprimirPersonas(List<Persona> personas){
        System.out.println(personas);
    }
    public static void imprimirTareas(List<Tarea> tareas){
        for (Tarea tarea : tareas){
            System.out.println(tarea.titulo);
            System.out.println(tarea.listaPersonas);
            System.out.println(tarea.isFinalizada);
            System.out.println(tarea.resultado);
        }
    }
}
