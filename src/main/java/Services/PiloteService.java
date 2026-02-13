package Services;

import Repository.PiloteRepository;
import entities.Pilote;
import entities.Pilote;

import java.util.List;

public class PiloteService implements IPiloteService {
    PiloteRepository pl;
    @Override
    public Pilote ajouterPilote(Pilote pilote) {
        pl.save(pilote);
        return null;
    }

    @Override
    public List<Pilote> ajouterPilotes(List<Pilote> pilotes) {
        pl.saveAll(pilotes);
        return null;
    }

    @Override
    public Pilote modifierPilote(Pilote pilote) {
        pl.save(pilote);
        return null;
    }

    @Override
    public void supprimerPilote(Long idPilote) {
        pl.deleteById(idPilote);

    }

    @Override
    public List<Pilote> listPilotes() {
        return pl.findAll();
    }

    @Override
    public Pilote recupererPilote(Long idPilote) {
        return pl.findById(idPilote).orElse(null);
    }

    @Override
    public Boolean archiverPilote(Long idPilote) {
        Pilote pilote = pl.findById(idPilote).orElse(null);
        pilote.setArchived(Boolean.TRUE);
        pl.save(pilote);
        return pilote.getArchived();
    }
}
