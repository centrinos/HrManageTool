package com.csssi.manage.mapper;

import com.csssi.manage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getByUsernameAndPassword(String loginName, String password);

}
