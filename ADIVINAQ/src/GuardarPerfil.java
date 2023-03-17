import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GuardarPerfil {
	private static void guardarPerfil(PerfilJugador jugador) {
	    try {
	        File file = new File(Guardado + jugador.getNombre() + ".txt");
	        if (!file.getParentFile().exists()) {
	            file.getParentFile().mkdirs();
	        }
	        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
	        oos.writeObject(jugador);
	        oos.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	private static PerfilJugador cargarPerfil(String nombre) {
	    try {
	        File file = new File(Guardado + nombre + ".txt");
	        if (file.exists()) {
	            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
	            PerfilJugador jugador = (PerfilJugador) ois.readObject();
	            ois.close();
	            return jugador;
	        } else {
	            System.out.println("El perfil del jugador no existe, cree un perfil nuevo.");
	        }
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return null;
	    }

}
