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
@Table(name = "tblusers")
@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String username;
    String password;
    int question;
    String answer;
    /**
     * 1- kullanıcı
     * 2- personel
     * 3-admin
     * 4-superadmin
     */
    int yetki;
    /**
     * 0- pasif
     * 1-aktif
     * 2-onayda bekleyen
     * 3-dondurulmus
     */
    int state;
}
