package com.maki.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne// many ingri can have the same cat etc onion source has source cat
    private IngridientCatergory catergory;


    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

    private boolean inStore = true;

}
