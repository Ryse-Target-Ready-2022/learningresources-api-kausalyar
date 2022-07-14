package com.tgt.rysetti.learningresourcsesapi.repository;
import com.tgt.rysetti.learningresourcsesapi.entity.LearningResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LearningResourceRepository extends JpaRepository<LearningResource, Integer>{
}
