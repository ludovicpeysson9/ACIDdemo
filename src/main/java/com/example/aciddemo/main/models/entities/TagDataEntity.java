package com.example.aciddemo.main.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tag_data", schema = "public", catalog = "postgres")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TagDataEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "`when`")
    private Timestamp when;
    @Basic
    @Column(name = "value")
    private BigDecimal value;
    @Basic
    @Column(name = "tag_id")
    private int tagId;
}
