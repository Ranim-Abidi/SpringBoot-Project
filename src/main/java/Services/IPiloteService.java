package Services;

import entities.Pilote;

import java.util.List;

public interface IPiloteService {
    
    Pilote ajouterPilote(Pilote pilote);

    List<Pilote> ajouterPilotes(List<Pilote> pilotes);

    Pilote modifierPilote(Pilote pilote);

    void supprimerPilote(Long idPilote);

    List<Pilote> listPilotes();

    Pilote recupererPilote(Long idPilote);

    Boolean archiverPilote(Long idPilote);
}
