/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author braya
 */
public class Vehiculo {
    private String placa;
    private String color;
    private String modelo;
    private Ticket ticket;
    
    public Vehiculo() {
    }

    public Vehiculo(String placa, String color, String modelo) {
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
    }

    public Vehiculo(String placa, String color, String modelo, Ticket ticket) {
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.ticket = ticket;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", color=" + color + ", modelo=" + modelo + ", ticket=" + ticket + '}';
    }

}
