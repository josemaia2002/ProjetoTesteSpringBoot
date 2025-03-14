package com.maia.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maia.app.rest.Model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}