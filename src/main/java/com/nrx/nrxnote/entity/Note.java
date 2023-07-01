package com.nrx.nrxnote.entity;

import jakarta.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String message;
}
