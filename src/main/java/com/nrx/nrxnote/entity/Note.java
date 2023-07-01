package com.nrx.nrxnote.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String noteHeader;
    private String noteMessage;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();

}
