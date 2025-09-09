package asa.com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Prestataire extends Travailleur{

    private List<HistoriqueSalaire> historiqueSalaires ;

    public Prestataire(int id, String nom, String prenom, String email, String numero,List<HistoriqueSalaire> historiqueSalaires) {
        super(id, nom, prenom, email, numero);
        historiqueSalaires = new ArrayList<>();
    }

    public void ajoutSalaire(double salaire,LocalDate dateDeChangement,String raison){
        historiqueSalaires.add(new HistoriqueSalaire(salaire,dateDeChangement,raison));

    }


    @Override
    public double salaire(double salaires) {
        salaires = historiqueSalaires.getLast().getSalaire();
        return salaires;
    }

    public String pointage(LocalDate date,int temps){
       if(temps == 1){
           return "true";
       } else if (temps > 1) {
           return "false";
       }else {
           return "IllegalArgumentException";
       }
    }

    public int nombreDeJour(LocalDate dateDeDebut,LocalDate dateDeFin){
       int nombre = dateDeFin.getDayOfMonth() - dateDeFin.getDayOfMonth();
        return nombre;
    }

    public double calculSalaire(LocalDate dateDeDebut, LocalDate dateDeFin) {
        return historiqueSalaires.stream()
                .filter(t-> t.getDateDeChangement().isBefore(dateDeDebut))
                .filter(t-> t.getDateDeChangement().isAfter(dateDeFin))
                .mapToDouble(HistoriqueSalaire::getSalaire)
                .sum();
    }


}
