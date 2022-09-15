package com.newProject.newProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tblSlider")
@Entity
public class Slider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String ad;
    String resimurl;
    String anabaslik;
    String altbaslik;
    String aciklama;
    String buttontext;
    String buttonlink;
    long startdate;
    long enddate;
    int status;


}
