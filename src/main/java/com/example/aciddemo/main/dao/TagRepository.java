package com.example.aciddemo.main.dao;

import com.example.aciddemo.main.models.entities.TagDataEntity;
import com.example.aciddemo.main.models.entities.TagEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TagRepository extends CrudRepository<TagEntity, Long> {

    List<TagEntity> findById(long id);
}
