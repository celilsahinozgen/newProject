package com.newProject.newProject.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tblcategories")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    long parentid;
    String ad;
    String url;
    String aciklama;
    String categoriurl;

    int status;

}
