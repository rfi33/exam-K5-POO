package asa.com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class PrestataireTest {

    private Prestataire prestataire;

    @BeforeEach
    void setUp(){
        prestataire = new Prestataire(1,"Rakoto","Son","Son126@gmail.com","+261343423854",new ArrayList<>());

    }

    @Test
    void salaire(){
        assertAll(
                "Retourne la salaire de l'employée",
                () ->assertEquals(10000.00,10000.00,"Retourne 10000.00"),
                () ->assertNotEquals(9000.00,10000.00,"doit retourner 10000.00")
        );
    }


    @Test
    void nombreDeJour() {
        LocalDate date1 = LocalDate.of(2023,5,8);
        LocalDate date2=  LocalDate.of(2023,5,28);
        LocalDate date3= LocalDate.of(2024,8,20);
        assertAll(
                "Retourne la somme du salaire par mois a un instant donner",
                () -> assertEquals(20,prestataire.nombreDeJour(date1,date2) ,"Retourne 20jours"),
                () -> assertEquals(385,prestataire.nombreDeJour(date2,date3) ,"Retourne 385jours")
            );
    }

    @Test
    void testCalculSalaire() {
        LocalDate date1 = LocalDate.of(2023,5,1);
         LocalDate date2=  LocalDate.of(2023,7,7);
        LocalDate date3= LocalDate.of(2023,8,20);
        assertAll(
                "Retourne la somme du salaire par mois a un instant donner",
                () -> assertEquals(20000,prestataire.calculSalaire(date1,date2) ,"Retourne 20000"),
                () -> assertEquals(30000,prestataire.calculSalaire(date1,date3) ,"Retourne 40000")
            );
    }
}