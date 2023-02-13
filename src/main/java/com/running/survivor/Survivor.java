package com.running.survivor;


import jakarta.persistence.*;

@Entity
@Table(name="survivors")
public class Survivor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

//    TODO:Finish Survivors Table
}
