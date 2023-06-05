package paquete01;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Buscar {
        public static Propietario buscarPropietario(String identificacion) {
            ArrayList<Propietario> propietarios1 = leerArchivo("propietarios.dat");
            for (Propietario propietario : propietarios1) {
                if (propietario.getIdentificacion().equals(identificacion)) {
                    return propietario;
                }
            }
            return null;
        }


        public static Barrio buscarBarrio(String nombreBarrio) {
        ArrayList<Barrio> barrios = leerArchivo("barrios.dat");
        for (Barrio barrio : barrios) {
            if (barrio.getNombre().equals(nombreBarrio)) {
                return barrio;
            }
        }
        return null;
    }

    public static Ciudad buscarCiudad(String nombreCiudad) {
        ArrayList<Ciudad> ciudades = leerArchivo("ciudades.dat");
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getNombre().equals(nombreCiudad)) {
                return ciudad;
            }
        }
        return null;
    }

    public static Constructora buscarConstructora(String idEmpresa) {
        ArrayList<Constructora> constructoras = leerArchivo("constructoras.dat");
        for (Constructora constructora : constructoras) {
            if (constructora.getIdEmpresa().equals(idEmpresa)) {
                return constructora;
            }
        }
        return null;
    }

    private static <T> ArrayList<T> leerArchivo(String nombreArchivo) {
        ArrayList<T> temporal = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(nombreArchivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            temporal = (ArrayList<T>) in.readObject();
            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temporal;
    }
}
