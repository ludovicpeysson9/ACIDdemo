package com.example.aciddemo.main.dao;

import com.example.aciddemo.main.models.entities.MeterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MeterRepository extends CrudRepository<MeterEntity, Long> {

    List<MeterEntity> findById(long id);
}
