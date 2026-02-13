package entities;

import entities.Championnat;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailChampionnat {
    @Id
    private String code;
    private String description;

    @OneToOne(mappedBy = "detailChampionnat")
    private Championnat championnat;
}
