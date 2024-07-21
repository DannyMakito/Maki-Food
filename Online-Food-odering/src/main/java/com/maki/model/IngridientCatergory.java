package com.maki.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngridientCatergory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String name;

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant; //from which res does ingri come from

    @OneToMany(mappedBy = "catergory",cascade = CascadeType.ALL)
    private List<IngredientsItem> ingredients = new ArrayList<>();
}
