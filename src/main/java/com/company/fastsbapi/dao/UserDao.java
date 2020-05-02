package com.company.fastsbapi.dao;


import com.company.fastsbapi.dataobject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


import java.util.List;


public interface UserDao extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {
//    User findByDbSourcename(String dbSourcename);
//
//    User findByDbTypeAndDbIpAndDbPortAndDbUser(String dbType, String dbIp, String dbPort, String dbUser);
//    @Modifying
//    void deleteByDbSourcename(String dbSourcename);
//
//    List<User> findByDbType(String dbType);

   // @Override
    //List<DBSourceManager> findAll();



}
