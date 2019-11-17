package com.pat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pat.domain.Urllinks;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import java.util.List;

//@Repository
public interface UrllinksRepository extends JpaRepository<Urllinks, Long>, JpaSpecificationExecutor<Urllinks> {
    //@RestResource(rel = "linkname", path="linkname")
    //List<Urllinks> findAllByLinknameLike(@Param("name") String name);

}