/*
 * bpClick nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * bpClick nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author braya
 */
public class Persona {
    private String id;
    private String nombre;
    private String email;
    private Vehiculo vehiculo;

    public Persona() {
    }

    public Persona(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Persona(String id, String nombre, String email, Vehiculo vehiculo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.vehiculo = vehiculo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + '}';
    }
    
}
