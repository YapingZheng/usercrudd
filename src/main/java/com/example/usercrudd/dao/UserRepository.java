package com.example.usercrudd.dao;

import com.example.usercrudd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //------查
    Optional<User> findById(Integer id);
    List<User> findAll();
    //------删
    void deleteById(Integer id);
    void deleteAll();
    //------增
    User save(User user);
    //------改
//    @Modifying
//    @Query(value = "update user set name =:name, sex =:sex where id =:id",
//            nativeQuery = true)
//    void update(@RequestParam("id")Integer id,
//                @RequestParam("name")String name,
//                @RequestParam("sex")String sex);
    @Transactional
    @Modifying
    @Query("update User as u set u.name=?1,u.sex=?2 where u.id=?3")
    void update(@RequestParam("name")String name,
                @RequestParam("sex")String sex,
                @RequestParam("id")Integer id);

}
