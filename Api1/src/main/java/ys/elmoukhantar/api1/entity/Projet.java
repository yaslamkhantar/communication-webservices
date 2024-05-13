package ys.elmoukhantar.api1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Projet {
    @Id

    private String id;
    private String name;


//    @ManyToMany()
//    private Collection<Developer> Collectiondeveloper=new ArrayList<>();
}
