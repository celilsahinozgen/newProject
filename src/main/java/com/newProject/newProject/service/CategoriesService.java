package com.newProject.newProject.service;


import com.newProject.newProject.entity.Categories;
import com.newProject.newProject.repository.CategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {
    private  final CategoriesRepository categoriesRepository;

    public CategoriesService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }
    public Categories save(Categories item) {
        categoriesRepository.save(item);
        return item;
    }

    public Categories update(Categories item){
        categoriesRepository.save(item);
        return item;
    }

    public Boolean delete(Categories item) {
        try {
            categoriesRepository.delete(item);
            return true;
        }catch (Exception exception) {
            return false;
        }
    }
    public List<Categories> findAll(){
        return categoriesRepository.findAll();
    }

    public List<Categories> findAllParents() {
        return categoriesRepository.findByParentidEquals(0L);
    }



    public Optional<Categories> findById(Long id){
        Optional<Categories> categories= categoriesRepository.findById(id);
        try {
            return categories;
        }catch (Exception exception) {
            return null;
        }
    }

}
