package com.example.aciddemo.main.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "meter", schema = "public", catalog = "postgres")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeterEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "label")
    private String label;
    @Basic
    @Column(name = "zone_id")
    private int zoneId;
    @Basic
    @Column(name = "tag_id")
    private Integer tagId;
}
