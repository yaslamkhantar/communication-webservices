package ys.elmoukhantar.api1.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ys.elmoukhantar.api1.entity.Developer;
import ys.elmoukhantar.api1.entity.Manager;

@RepositoryRestResource
public interface Developerrepo extends JpaRepository<Developer, String> {

    Developer findByName(String name);
}
