package org.sousadiogo.cliente;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.SqlResultSetMapping;

@Entity

public class Cliente extends PanacheEntity {

    public String nome;

}

