package ys.elmoukhantar.api1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Manager {

    @Id
    private String cin;
    private String firstname;
    private String email;

//    @OneToMany(fetch = FetchType.EAGER)
//    private Collection<Equipe> equipes=new ArrayList<>();
}
