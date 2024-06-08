package com.example.api_books.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String titulo;
    public String autor;
    public String area;
    public String editora;
    @JsonProperty("ano_de_lancamento")
    public Number anoDeLancamento;
    public  String isbn;
}
