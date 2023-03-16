package com.example.aciddemo.main.dao;

import com.example.aciddemo.main.models.entities.TagDataEntity;
import com.example.aciddemo.main.models.entities.ZoneEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ZoneRepository extends CrudRepository<ZoneEntity, Long> {

    List<ZoneEntity> findById(long id);
}
