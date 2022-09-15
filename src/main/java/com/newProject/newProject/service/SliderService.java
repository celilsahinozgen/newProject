package com.newProject.newProject.service;

import com.newProject.newProject.entity.Slider;
import com.newProject.newProject.repository.SliderRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SliderService {

    private final SliderRepository sliderRepository;

    public SliderService(SliderRepository sliderRepository) {
        this.sliderRepository = sliderRepository;
    }

    public Slider save(Slider item) {
        sliderRepository.save(item);
        return item;
    }

    public Slider update(Slider item) {
        sliderRepository.save(item);
        return item;
    }

    public boolean delete(Slider item) {
        try {
            sliderRepository.delete(item);
            return true;
        }catch (Exception exception) {
            return false;
        }
    }

    public List<Slider> findAll() {
        return sliderRepository.findAll();

    }

    public List<Slider> findAllActive() {
        long nowdate= new Date().getTime();
        List<Slider> list= sliderRepository.findByStartdateGreaterThanAndEnddateLessThanAndStatusEquals(
                nowdate, nowdate, 1 );
     return list;
    }
}
