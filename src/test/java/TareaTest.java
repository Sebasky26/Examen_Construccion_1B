import org.example.Tarea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TareaTest {
    @Test
    public void testCrearTarea() {
        Tarea tarea = new Tarea("Tarea de prueba");
        Assertions.assertEquals("Tarea de prueba", tarea.getDescripcion());
        Assertions.assertFalse(tarea.estaCompletada());
    }

    @Test
    public void testMarcarTareaComoCompletada() {
        Tarea tarea = new Tarea("Completar tarea");
        tarea.marcarComoCompletada();
        Assertions.assertTrue(tarea.estaCompletada());
    }
}
