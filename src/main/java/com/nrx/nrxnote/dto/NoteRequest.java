package com.nrx.nrxnote.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class NoteRequest {

    private String noteHeader;

    private String noteMessage;
}
