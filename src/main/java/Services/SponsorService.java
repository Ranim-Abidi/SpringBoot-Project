package Services;

import Repository.SponsorRepository;
import entities.Sponsor;

import java.util.List;

public class SponsorService implements ISponsorService {
    SponsorRepository sp;
    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        sp.save(sponsor);
        return null;
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        sp.saveAll(sponsors);
        return null;
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        sp.save(sponsor);
        return null;
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sp.deleteById(idSponsor);

    }

    @Override
    public List<Sponsor> listSponsors() {
        return sp.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sp.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor = sp.findById(idSponsor).orElse(null);
        sponsor.setArchived(Boolean.TRUE);
        sp.save(sponsor);
        return sponsor.getArchived();
    }
}
