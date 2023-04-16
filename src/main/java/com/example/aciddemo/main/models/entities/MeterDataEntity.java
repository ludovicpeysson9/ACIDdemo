package com.example.aciddemo.main.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "meter_data", schema = "public", catalog = "postgres")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeterDataEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "`when`")
    private Timestamp when;
    @Basic
    @Column(name = "value")
    private BigDecimal value;
    @Basic
    @Column(name = "meter_id")
    private int meterId;

}

