package com.example.aciddemo.main.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tag")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TagEntity {
    @Id
    private Long id;

    private String label;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
