package entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;
    private Integer nbPointsTotal;
    private Integer classementGeneral;
    Boolean archived;
    LocalDate dateCreation;
    LocalDate dateDerniereModification;

    @OneToMany(mappedBy = "pilote")
    private List<Position> positions;

    @ManyToOne
    private Equipe equipe;
}
