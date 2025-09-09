package asa.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public abstract class Travailleur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String numero;

    public abstract double salaire(double salaires);

}
