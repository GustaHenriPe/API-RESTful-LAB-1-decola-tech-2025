package com.dio.decola_tech_2025.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Feature> features;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<News> news;
}

