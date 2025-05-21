package org.example.models;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Musica {
    @SerializedName("name")
    private String nome;
    @SerializedName("duration")
    private double duracao;

}
