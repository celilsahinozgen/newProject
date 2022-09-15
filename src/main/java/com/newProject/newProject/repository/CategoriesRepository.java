package com.newProject.newProject.repository;

import com.newProject.newProject.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {

    List<Categories> findByParentidEquals(long id);

}
