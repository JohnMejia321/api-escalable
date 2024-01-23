package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user_copy")
public class User {

    @Id
    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @CassandraType(type = CassandraType.Name.INT)
    private Integer id;

    @Column("nombre")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String nombre;

    @Column("apellido")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String apellido;

    // Constructor, getters y setters

    public User() {
        // Constructor por defecto necesario para Spring Data
    }

    public User(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // toString, equals, hashCode (puedes generarlos automáticamente en tu IDE)
}
