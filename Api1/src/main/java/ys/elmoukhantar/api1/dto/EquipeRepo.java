package ys.elmoukhantar.api1.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import ys.elmoukhantar.api1.entity.Equipe;
import ys.elmoukhantar.api1.entity.Manager;

public interface EquipeRepo extends JpaRepository<Equipe,String> {
}
