package com.newProject.newProject.repository;


import com.newProject.newProject.entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrunRepository extends JpaRepository<Urun,Long> {
}
