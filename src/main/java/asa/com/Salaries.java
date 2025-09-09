package asa.com;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter

public class Salaries extends Travailleur {

    private int heureDeTravaille;

    public Salaries(int id, String nom, String prenom, String email, String numero,int heureDeTravaille) {
        super(id, nom, prenom, email, numero);
        this.heureDeTravaille = heureDeTravaille;
    }

    @Override
    public double salaire(double salaires) {
        return salaires*heureDeTravaille;
    }


}
