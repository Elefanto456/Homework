package ru.kpfu.itis.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.model.Photo;

@Repository
public interface PhotoRepo extends CrudRepository<Photo, Integer> {
}
