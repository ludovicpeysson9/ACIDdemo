package com.example.aciddemo.main.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "tag", schema = "public", catalog = "postgres")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TagEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "label")
    private String label;
}
