package me.zhengjie.test.repository;

import me.zhengjie.test.domain.Yueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author cgj
* @date 2019-11-05
*/
public interface YuebaRepository extends JpaRepository<Yueba, Long>, JpaSpecificationExecutor<Yueba> {
}