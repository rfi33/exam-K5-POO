package asa.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor

public class HistoriqueSalaire {

    private double salaire;
    private LocalDate dateDeChangement;
    private String raison;

}
