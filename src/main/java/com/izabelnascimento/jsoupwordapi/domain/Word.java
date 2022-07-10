package com.izabelnascimento.jsoupwordapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Word")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Word implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long counter;

    @OneToMany
    private List<Substantive> substantives;

}
