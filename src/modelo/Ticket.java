/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author braya
 */
public class Ticket {
    private int id;
    private Date HoraIngreso;
    private Date HoraSalida;
    private int puesto;

    public int getId() {
        return id;
    }

    public Ticket(int id, Date HoraIngreso, Date HoraSalida, int puesto) {
        this.id = id;
        this.HoraIngreso = HoraIngreso;
        this.HoraSalida = HoraSalida;
        this.puesto = puesto;
        
    }

    public Ticket() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getHoraIngreso() {
        return HoraIngreso;
    }

    public void setHoraIngreso(Date HoraIngreso) {
        this.HoraIngreso = HoraIngreso;
    }

    public Date getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(Date HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", HoraIngreso=" + HoraIngreso + ", HoraSalida=" + HoraSalida + ", puesto=" + puesto + '}';
    }
    
}
