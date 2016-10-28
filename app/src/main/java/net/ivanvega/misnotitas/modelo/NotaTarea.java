package net.ivanvega.misnotitas.modelo;

import java.util.Date;

/**
 * Created by alcohonsilver on 27/10/16.
 */
public class NotaTarea {
    int id;
    String titulo;
    String descripcion;
    int tipo;
    String hora_fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getHora_fecha() {
        return hora_fecha;
    }

    public void setHora_fecha(String hora_fecha) {
        this.hora_fecha = hora_fecha;
    }

    public String getHora_fecha_vencimiento() {
        return hora_fecha_vencimiento;
    }

    public void setHora_fecha_vencimiento(String hora_fecha_vencimiento) {
        this.hora_fecha_vencimiento = hora_fecha_vencimiento;
    }

    String hora_fecha_vencimiento;


}
