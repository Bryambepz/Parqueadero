/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import modelo.Vehiculo;

/**
 *
 * @author braya
 */
public class ControladorVehiculo extends ControladorAbstra<Vehiculo>{

    public ControladorVehiculo() {
        super();
    }
    
    public Vehiculo read(String buscar){
        var list = getListaObjetos();
        for (Vehiculo vehiculo:  list) {
            if (vehiculo.getPlaca().equals(buscar)) {
                return vehiculo;
            }
        }
        return null;
    }
    
    public Vehiculo update(Vehiculo objeto){
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var p = getListaObjetos().get(i);
            if (objeto.getPlaca().equals(p.getPlaca())) {
                getListaObjetos().set(i, objeto);
                return objeto;
            }
        }
        return null;
    }
    
    public boolean delete(Vehiculo objeto){
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var p = getListaObjetos().get(i);
            if (objeto.getPlaca().equals(p.getPlaca())) {
                getListaObjetos().remove(i);
                return true;
            }
        }
        return false;
    }
}
