package ru.kpfu.itis.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.model.User;

@Repository
    public interface UserRepo extends CrudRepository<User, Integer> {
}
