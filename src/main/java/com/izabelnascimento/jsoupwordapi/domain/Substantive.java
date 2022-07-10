package com.izabelnascimento.jsoupwordapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "substantive")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Substantive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

}
