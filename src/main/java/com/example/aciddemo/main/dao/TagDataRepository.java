package com.example.aciddemo.main.dao;

import com.example.aciddemo.main.models.entities.MeterEntity;
import com.example.aciddemo.main.models.entities.TagDataEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TagDataRepository extends CrudRepository<TagDataEntity, Long> {

    List<TagDataEntity> findById(long id);
}

