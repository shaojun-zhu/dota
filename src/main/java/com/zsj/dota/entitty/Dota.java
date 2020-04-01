package com.zsj.dota.entitty;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Dota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int kill;
    @Column
    private int dead;
    @Column
    private String result;
}
