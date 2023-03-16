package com.example.aciddemo.main.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tagdata")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TagDataEntity {
    @Id
    private Long id;

    private Long tag_id;

    private Timestamp when;

    private Long value;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
