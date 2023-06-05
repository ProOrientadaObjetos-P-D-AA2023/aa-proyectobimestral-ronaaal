/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Inmobiliaria {
    public static Scanner lec = new Scanner(System.in);
    private static final String PROPIETARIOS_FILE = "propietarios.dat";
    private static final String BARRIOS_FILE = "barrios.dat";
    private static final String CIUDADES_FILE = "ciudades.dat";
    private static final String CONSTRUCTORAS_FILE = "constructoras.dat";
    private static final String CASAS_FILE = "casas.dat";
    private static final String DEPARTAMENTOS_FILE = "departamentos.dat";

    private List<Propietario> propietarios;
    private List<Barrio> barrios;
    private List<Ciudad> ciudades;
    private List<Constructora> constructoras;
    private List<Casa> casas;
    private List<Departamento> departamentos;

    public Inmobiliaria() {
        propietarios = new ArrayList<>();
        barrios = new ArrayList<>();
        ciudades = new ArrayList<>();
        constructoras = new ArrayList<>();
        casas = new ArrayList<>();
        departamentos = new ArrayList<>();
    }

    public void agregarPropietario(Propietario propietario) {
        propietarios.add(propietario);
    }

    public void agregarBarrio(Barrio barrio) {
        barrios.add(barrio);
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public void agregarConstructora(Constructora constructora) {
        constructoras.add(constructora);
    }

    public void agregarCasa(Casa casa) {
        casas.add(casa);
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void guardarPropietarios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PROPIETARIOS_FILE))) {
            oos.writeObject(propietarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarBarrios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BARRIOS_FILE))) {
            oos.writeObject(barrios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarCiudades() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CIUDADES_FILE))) {
            oos.writeObject(ciudades);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarConstructoras() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CONSTRUCTORAS_FILE))) {
            oos.writeObject(constructoras);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarCasas() {
        try (ObjectOutputStream cas = new ObjectOutputStream(new FileOutputStream(CASAS_FILE))) {
            cas.writeObject(casas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarDepartamentos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DEPARTAMENTOS_FILE))) {
            oos.writeObject(departamentos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarPropietarios() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PROPIETARIOS_FILE))) {
            propietarios = (List<Propietario>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void cargarBarrios() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BARRIOS_FILE))) {
            barrios = (List<Barrio>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void cargarCiudades() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CIUDADES_FILE))) {
            ciudades = (List<Ciudad>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void cargarConstructoras() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CONSTRUCTORAS_FILE))) {
            constructoras = (List<Constructora>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void cargarCasas() {
        try (ObjectInputStream cas = new ObjectInputStream(new FileInputStream(CASAS_FILE))) {
            casas = (List<Casa>) cas.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void cargarDepartamentos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DEPARTAMENTOS_FILE))) {
            departamentos = (List<Departamento>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void listarPropietarios() {
        System.out.println("Propietarios:");
        for (Propietario propietario : propietarios) {
            System.out.println("Nombres: " + propietario.getNombres());
            System.out.println("Apellidos: " + propietario.getApellidos());
            System.out.println("Identificación: " + propietario.getIdentificacion());
            System.out.println("-----------------------------");
        }
    }

    public void listarBarrios() {
        System.out.println("Barrios:");
        for (Barrio barrio : barrios) {
            System.out.println("Nombre: " + barrio.getNombre());
            System.out.println("Referencia: " + barrio.getReferencia());
            System.out.println("-----------------------------");
        }
    }

    public void listarCiudades() {
        System.out.println("Ciudades:");
        for (Ciudad ciudad : ciudades) {
            System.out.println("Nombre: " + ciudad.getNombre());
            System.out.println("Provincia: " + ciudad.getProvincia());
            System.out.println("-----------------------------");
        }
    }

    public void listarConstructoras() {
        System.out.println("Constructoras:");
        for (Constructora constructora : constructoras) {
            System.out.println("Nombre: " + constructora.getNombreConstructora());
            System.out.println("ID Empresa: " + constructora.getIdEmpresa());
            System.out.println("-----------------------------");
        }
    }

    public void listarDatos() {
        System.out.println("Propietarios:");
        for (Propietario propietario : propietarios) {
            System.out.println(propietario);
        }

        System.out.println("Barrios:");
        for (Barrio barrio : barrios) {
            System.out.println(barrio);
        }

        System.out.println("Ciudades:");
        for (Ciudad ciudad : ciudades) {
            System.out.println(ciudad);
        }

        System.out.println("Constructoras:");
        for (Constructora constructora : constructoras) {
            System.out.println(constructora);
        }
    }

    public void listarCasas() {
        System.out.println("Casas:");
        for (Casa casa : casas) {
            System.out.println("Propietario: " + casa.getPropietario().getNombres() + " "
                    + casa.getPropietario().getApellidos());
            System.out.println("Precio por metro cuadrado: $" + casa.getPrecioMetroCuadrado());
            System.out.println("Metros cuadrados: " + casa.getMetrosCuadarados());
            System.out.println("Barrio: " + casa.getBarrio().getNombre());
            System.out.println("Ciudad: " + casa.getCiudad().getNombre());
            System.out.println("Provincia: " + casa.getCiudad().getProvincia());
            System.out.println("Número de cuartos: " + casa.getNumeroCuartos());
            System.out.println("Constructora: " + casa.getConstructora().getNombreConstructora());
            System.out.println("Costo final: $" + casa.getCostoFinal());
            System.out.println("-----------------------------");
        }
    }

    public void listarDepartamentos() {
        System.out.println("Departamentos:");
        for (Departamento departamento : departamentos) {
            System.out.println("Propietario: " + departamento.getPropietario().getNombres() + " "
                    + departamento.getPropietario().getApellidos());
            System.out.println("Precio por metro cuadrado: $" + departamento.getPrecioMetroCuadrado());
            System.out.println("Metros cuadrados: " + departamento.getNumeroMetrosCuadrados());
            System.out.println("Valor de la alicuota mensual: $" + departamento.getValoraAicuataMensua());
            System.out.println("Barrio: " + departamento.getBarrio().getNombre());
            System.out.println("Ciudad: " + departamento.getCiudad().getNombre());
            System.out.println("Provicnia: " + departamento.getCiudad().getProvincia());
            System.out.println("Nombre del edificio: " + departamento.getNombreEdificio());
            System.out.println("Ubicación en el edificio: " + departamento.getUbicacionEnEdificio());
            System.out.println("Constructora: " + departamento.getConstructora().getNombreConstructora());
            System.out.println("Costo final: $" + departamento.getCostoFinal());
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();

        // Crear objetos de ejemplo
        Propietario propietario1 = new Propietario("Juan", "Perez", "1234567890");
        Propietario propietario2 = new Propietario("María", "González", "123");
        Barrio barrio1 = new Barrio("Centro", "Cerca del centro histórico");
        Barrio barrio2 = new Barrio("Residencial", "Zona residencial exclusiva");
        Ciudad ciudad1 = new Ciudad("Quito", "Pichincha");
        Ciudad ciudad2 = new Ciudad("Guayaquil", "Guayas");
        Constructora constructora1 = new Constructora("Constructora ABC", "ABC123");
        Constructora constructora2 = new Constructora("Constructora XYZ", "XYZ456");

        // Agregar objetos a la inmobiliaria
        inmobiliaria.agregarPropietario(propietario1);
        inmobiliaria.agregarPropietario(propietario2);
        inmobiliaria.agregarBarrio(barrio1);
        inmobiliaria.agregarBarrio(barrio2);
        inmobiliaria.agregarCiudad(ciudad1);
        inmobiliaria.agregarCiudad(ciudad2);
        inmobiliaria.agregarConstructora(constructora1);
        inmobiliaria.agregarConstructora(constructora2);

        // Guardar datos en archivos
        inmobiliaria.guardarPropietarios();
        inmobiliaria.guardarBarrios();
        inmobiliaria.guardarCiudades();
        inmobiliaria.guardarConstructoras();

        // Cargar datos desde archivos
        inmobiliaria.cargarPropietarios();
        inmobiliaria.cargarBarrios();
        inmobiliaria.cargarCiudades();
        inmobiliaria.cargarConstructoras();

        // Listar objetos
        inmobiliaria.listarPropietarios();
        inmobiliaria.listarBarrios();
        inmobiliaria.listarCiudades();
        inmobiliaria.listarConstructoras();

        //casos
        System.out.println("elegir 1 para añadir una nueva casa");
        System.out.println("elegir 2 para añadir un nuevo departamento");
        int casos = lec.nextInt();
        lec.nextLine();

        switch (casos) {
            case 1:
//       --------------------   añadir casa -------------------------
                System.out.println("Ingrese identificación del propietario:");
                String identificacion = lec.nextLine();

                Buscar buscar = new Buscar();
                System.out.println("ingrese numero de cuartos: ");
                int numCuartos = lec.nextInt();
                System.out.println("ingrese metors cuadrados: ");
                double metros = lec.nextDouble();
                System.out.println("ingrese valor metros cuadrados: ");
                double valorMetros = lec.nextDouble();
                lec.nextLine();

                Propietario propietarioEncontrado = buscar.buscarPropietario(identificacion);

                if (propietarioEncontrado != null) {
                    System.out.println("Ingrese nombre del barrio:");
                    String nombreBarrio2 = lec.nextLine();

                    Barrio barrioEncontrado2 = buscar.buscarBarrio(nombreBarrio2);

                    if (barrioEncontrado2 != null) {
                        System.out.println("Ingrese nombre de la ciudad:");
                        String nombreCiudad2 = lec.nextLine();

                        Ciudad ciudadEncontrada2 = buscar.buscarCiudad(nombreCiudad2);

                        if (ciudadEncontrada2 != null) {
                            System.out.println("Ingrese ID de la empresa constructora:");
                            String idEmpresa2 = lec.nextLine();

                            Constructora constructoraEncontrada2 = buscar.buscarConstructora(idEmpresa2);

                            if (constructoraEncontrada2 != null) {
                                Casa nuevaCasa = new Casa(propietarioEncontrado, ciudadEncontrada2, constructoraEncontrada2, barrioEncontrado2, numCuartos, metros, valorMetros);
                                nuevaCasa.calcularCostoFinal();
                                inmobiliaria.agregarCasa(nuevaCasa);
                                inmobiliaria.guardarCasas();

                                System.out.println("Casa agregada exitosamente.");
                            } else {
                                System.out.println("No se encontró la empresa constructora.");
                            }
                        } else {
                            System.out.println("No se encontró la ciudad.");
                        }
                    } else {
                        System.out.println("No se encontró el barrio.");
                    }
                } else {
                    System.out.println("No se encontró el propietario con la identificación proporcionada.");
                }

                inmobiliaria.cargarCasas();
                inmobiliaria.listarCasas();
                break;


            case 2:
                //       --------------------   añadir departamento -------------------------
                System.out.println("Ingrese identificación del propietario:");
                String identificacion2 = lec.nextLine();

                Buscar buscar2 = new Buscar();
                System.out.println("ingrese numero de metros cuadrados: ");
                double numMetros = lec.nextDouble();
                System.out.println("ingrese valor por metro cuadrado: ");
                double valorMetroC = lec.nextDouble();
                System.out.println("ingrese valor alicuota mensual: ");
                double valorAlicuota = lec.nextDouble();
                System.out.println("ingrese numero de cuartos: ");
                int numC = lec.nextInt();
                lec.nextLine();
                System.out.println("ingrese nombre del edificio: ");
                String nombreEdificio = lec.nextLine();
                System.out.println("ingrese su ubicacion en el edificio");
                String ubicacion = lec.nextLine();
                Propietario propietarioEncontrado2 = buscar2.buscarPropietario(identificacion2);

                if (propietarioEncontrado2 != null) {
                    System.out.println("Ingrese nombre del barrio:");
                    String nombreBarrio2 = lec.nextLine();

                    Barrio barrioEncontrado2 = buscar2.buscarBarrio(nombreBarrio2);

                    if (barrioEncontrado2 != null) {
                        System.out.println("Ingrese nombre de la ciudad:");
                        String nombreCiudad2 = lec.nextLine();

                        Ciudad ciudadEncontrada2 = buscar2.buscarCiudad(nombreCiudad2);

                        if (ciudadEncontrada2 != null) {
                            System.out.println("Ingrese ID de la empresa constructora:");
                            String idEmpresa2 = lec.nextLine();

                            Constructora constructoraEncontrada2 = buscar2.buscarConstructora(idEmpresa2);

                            if (constructoraEncontrada2 != null) {
                                Departamento nuevoDepartamento = new Departamento(propietarioEncontrado2, valorMetroC, valorAlicuota, numC, barrioEncontrado2, ciudadEncontrada2, nombreEdificio, ubicacion, constructoraEncontrada2, numMetros);
                                nuevoDepartamento.calcularCostoFinal();
                                inmobiliaria.agregarDepartamento(nuevoDepartamento);
                                inmobiliaria.guardarDepartamentos();

                                System.out.println("Departamento agregado exitosamente.");
                            } else {
                                System.out.println("No se encontró la empresa constructora.");
                            }
                        } else {
                            System.out.println("No se encontró la ciudad.");
                        }
                    } else {
                        System.out.println("No se encontró el barrio.");
                    }
                } else {
                    System.out.println("No se encontró el propietario con la identificación proporcionada.");
                }

                inmobiliaria.cargarDepartamentos();
                inmobiliaria.listarDepartamentos();
                break;
            default:
                System.out.println("el caso elegido no coincide con alguno existente");
        }
    }
}
