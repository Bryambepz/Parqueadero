/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public abstract class ControladorAbstra<T> {
    
    private List<T> listaObjetos;
    
    public ControladorAbstra() {
        this.listaObjetos = new ArrayList<>();
    }
    
    public boolean create(T objeto){
        return listaObjetos.add(objeto);
    }
    
    public List<T> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<T> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
    
}
