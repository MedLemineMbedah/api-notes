package com.example.apinotes.persistance.repository;

import com.example.apinotes.persistance.model.note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPARepository extends JpaRepository<note, Integer> {
    note get(String idEtudiant);
}
