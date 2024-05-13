package ys.elmoukhantar.api1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Equipe {
    @Id

    private String equipeid;
    private String equipename;
    private String responsable;
    private String domaine;
//    @ManyToOne
//    private Manager manager;

}
