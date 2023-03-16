package com.example.aciddemo.main.dao;

import com.example.aciddemo.main.models.entities.MeterDataEntity;
import com.example.aciddemo.main.models.entities.MeterEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MeterDataRepository extends CrudRepository<MeterDataEntity, Long> {

    List<MeterDataEntity> findById(long id);
}

