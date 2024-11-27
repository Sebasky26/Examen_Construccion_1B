import org.example.ListaDeTareas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListaDeTareasTest {
    @Test
    public void testAgregarTarea() {
        ListaDeTareas app = new ListaDeTareas();
        app.agregarTarea("Nueva tarea");
        Assertions.assertEquals(1, app.tareas.size());
        Assertions.assertEquals("Nueva tarea", app.tareas.get(0).getDescripcion());
    }

    @Test
    public void testMarcarTareaComoCompletada() {
        ListaDeTareas app = new ListaDeTareas();
        app.agregarTarea("Tarea a completar");
        app.marcarTareaComoCompletada(1);
        Assertions.assertTrue(app.tareas.get(0).estaCompletada());
    }
}
