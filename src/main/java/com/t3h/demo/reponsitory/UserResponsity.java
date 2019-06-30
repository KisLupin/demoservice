package com.t3h.demo.reponsitory;

import com.t3h.demo.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserResponsity extends JpaRepository<UserProfile,Integer> {

}
