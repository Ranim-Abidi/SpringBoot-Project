package Services;

import entities.Equipe;

import java.util.List;

public interface IEquipeService {

    Equipe ajouterEquipe(Equipe equipe);

    List<Equipe> ajouterEquipes(List<Equipe> equipes);

    Equipe modifierEquipe(Equipe equipe);

    void supprimerEquipe(Long idEquipe);

    List<Equipe> listEquipes();

    Equipe recupererEquipe(Long idEquipe);

    Boolean archiverEquipe(Long idEquipe);
}