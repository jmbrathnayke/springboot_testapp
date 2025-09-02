package com.manuj.testapp.repo;

import com.manuj.testapp.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <UserModel,Integer> {
}
