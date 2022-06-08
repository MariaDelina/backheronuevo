/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.experiencia.heroku.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name = "experiencia")
public class Heroku {
     @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="lugar_de_trabajo")
    private String lugar_de_trabajo;
    @Column(name="titulo_del_puesto")
    private String titulo_del_puesto;
    @Column(name="logo_de_empresa")
    private String logo_de_empresa;
    @Column(name="descripcion_de_actividades")
    private String descripcion_de_actividades;
    
    public Heroku(){
    }
    public Heroku(Long id, String lugar_de_trabajo, String titulo_del_puesto, String logo_de_empresa, String descripcion_de_actividades){
        this.id=id;
        this.lugar_de_trabajo=lugar_de_trabajo;
        this.titulo_del_puesto=titulo_del_puesto;
        this.logo_de_empresa=logo_de_empresa;
        this.descripcion_de_actividades=descripcion_de_actividades;
        
    }
}
