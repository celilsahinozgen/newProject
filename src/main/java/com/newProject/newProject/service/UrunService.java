package com.newProject.newProject.service;

import com.newProject.newProject.dto.response.UrunResponseDto;
import com.newProject.newProject.entity.Urun;
import com.newProject.newProject.mapper.UrunMapper;
import com.newProject.newProject.repository.UrunRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UrunService {

   private final UrunRepository urunRepository;
   private final UrunMapper urunMapper;

    public UrunService(UrunRepository urunRepository, UrunMapper urunMapper) {
        this.urunRepository = urunRepository;
        this.urunMapper = urunMapper;
    }


    public List<UrunResponseDto> findAllUrunResponse() {
        List<UrunResponseDto> list = new ArrayList<>();
        for (Urun urun: urunRepository.findAll()) {
            list.add(
                    urunMapper.toResponseDto(urun)
            );
        }


        return list;
    }



}
