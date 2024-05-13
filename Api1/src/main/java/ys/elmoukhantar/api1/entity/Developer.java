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
public class Developer {
@Id
    private String devid;
    private String name;
    private String prenom;
    private String technologie;





}
