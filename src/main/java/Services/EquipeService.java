package Services;

import Repository.EquipeRepository;
import entities.Equipe;

import java.util.List;

public class EquipeService implements IEquipeService {
    EquipeRepository pl;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        pl.save(equipe);
        return null;
    }

    @Override
    public List<Equipe> ajouterEquipes(List<Equipe> equipes) {
        pl.saveAll(equipes);
        return null;
    }

    @Override
    public Equipe modifierEquipe(Equipe equipe) {
        pl.save(equipe);
        return null;
    }

    @Override
    public void supprimerEquipe(Long idEquipe) {
        pl.deleteById(idEquipe);

    }

    @Override
    public List<Equipe> listEquipes() {
        return pl.findAll();
    }

    @Override
    public Equipe recupererEquipe(Long idEquipe) {
        return pl.findById(idEquipe).orElse(null);
    }

    @Override
    public Boolean archiverEquipe(Long idEquipe) {
        Equipe equipe = pl.findById(idEquipe).orElse(null);
        equipe.setArchived(Boolean.TRUE);
        pl.save(equipe);
        return equipe.getArchived();
    }
}