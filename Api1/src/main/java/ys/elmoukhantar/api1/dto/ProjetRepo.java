package ys.elmoukhantar.api1.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import ys.elmoukhantar.api1.entity.Projet;

public interface ProjetRepo extends JpaRepository<Projet,String> {
}
