package com.example.aciddemo.main.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "zone")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZoneEntity {
    @Id
    private Long id;

    private String label;

    private Long parent_zone_id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
