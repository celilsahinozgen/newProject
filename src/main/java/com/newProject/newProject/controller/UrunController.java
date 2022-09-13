package com.newProject.newProject.controller;


import static com.newProject.newProject.constants.RestApiUrls.*;

import com.newProject.newProject.dto.response.UrunResponseDto;
import com.newProject.newProject.service.UrunService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(VERSION+URUNCONTROLLER)
@Api(value ="uruncontroller" )
public class UrunController {
    private final UrunService urunService;

    public UrunController(UrunService urunService) {
        this.urunService = urunService;
    }

    @GetMapping("findallurunresponse")
    public ResponseEntity<List<UrunResponseDto>> findAllUrun() {
        return ResponseEntity.ok(urunService.findAllUrunResponse());
    }



}
