package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by m on 1/29/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
