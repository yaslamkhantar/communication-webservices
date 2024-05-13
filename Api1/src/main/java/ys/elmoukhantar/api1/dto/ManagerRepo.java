package ys.elmoukhantar.api1.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import ys.elmoukhantar.api1.entity.Manager;

public interface ManagerRepo extends JpaRepository<Manager,String> {

    Manager findByEmail(String email);
}
