package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sql.rowset.CachedRowSet;

/**
 * Created by m on 1/29/17.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{


}
