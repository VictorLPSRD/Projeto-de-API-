package com.example.api_exemplo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @JsonProperty("titulo") // Mapeia o campo "titulo" do JSON
    private String titulo;

    @JsonProperty("autor") // Mapeia o campo "autor" do JSON
    private String autor;

    @JsonProperty("area") // Mapeia o campo "area" do JSON
    private String area;

    @JsonProperty("imagem") // Mapeia o campo "imagem" do JSON
    private String imagem;

    @JsonProperty("editora") // Mapeia o campo "editora" do JSON
    private String editora;

    @JsonProperty("ano_de_publicacao") // Já está funcionando
    private int anoDePublicacao;

    @JsonProperty("isbn") // Mapeia o campo "isbn" do JSON
    private String isbn;
}
