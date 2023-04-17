package com.example.aciddemo.main.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "zone", schema = "public", catalog = "postgres")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZoneEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Pattern(regexp="^[A-Za-z1-9]+$")
    @Column(name = "label")
    private String label;
    @Basic
    @Column(name = "parent_zone_id")
    private Integer parentZoneId;
}
