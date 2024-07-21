package com.maki.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String descrption;

    private Long price;

    @ManyToOne
    private Catergory foodCatergory;

    @Column(length = 1000)
    @ElementCollection
    private List<String> images;

    private boolean available;

    @ManyToOne// mamy food are in on e res
    private Restaurant restaurant;

    private boolean isVegeterian;
    private boolean isSeasonal;

    @ManyToMany//inside one food many ingredients
    private List<IngredientsItem> ingredeints = new ArrayList<>();

    private Date creationDate;

}
