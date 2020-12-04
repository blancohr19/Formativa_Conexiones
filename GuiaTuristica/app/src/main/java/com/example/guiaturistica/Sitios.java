package com.example.guiaturistica;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Sitios implements Serializable {
    @SerializedName("nombresitio")
    @Expose
    private String nombresitio;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;
    @SerializedName("nombremunicipio")
    @Expose
    private String nombremunicipio;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("telefono")
    @Expose
    private String telefono;
    private final static long serialVersionUID = -7316142370211701371L;


    public Sitios() {
    }

    public Sitios(String nombresitio, String tipo, String descripcion, String nombremunicipio, String direccion, String telefono) {
        super();
        this.nombresitio = nombresitio;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.nombremunicipio = nombremunicipio;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombresitio() {
        return nombresitio;
    }

    public void setNombresitio(String nombresitio) {
        this.nombresitio = nombresitio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombremunicipio() {
        return nombremunicipio;
    }

    public void setNombremunicipio(String nombremunicipio) {
        this.nombremunicipio = nombremunicipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
