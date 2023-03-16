package com.example.aciddemo.main.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "meter")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeterEntity {
    @Id
    private Long id;

    private Long zone_id;

    private Long tag_id;

    private String label;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
