package com.newProject.newProject.repository;

import com.newProject.newProject.entity.Slider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SliderRepository extends JpaRepository<Slider,Long> {

    List<Slider> findByStartdateLessThanAndEnddateGreaterThanAndStatusEquals(long startdate,long enddate, int status);
}
