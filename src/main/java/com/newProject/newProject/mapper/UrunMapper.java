package com.newProject.newProject.mapper;


import com.newProject.newProject.dto.request.UrunRequestDto;
import com.newProject.newProject.dto.response.UrunResponseDto;
import com.newProject.newProject.entity.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UrunMapper {

    Urun toUrun(final UrunRequestDto urunRequestDto);
    UrunResponseDto toResponseDto(final Urun urun);
}
