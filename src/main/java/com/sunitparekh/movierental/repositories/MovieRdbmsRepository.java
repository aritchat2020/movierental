package com.sunitparekh.movierental.repositories;

import com.sunitparekh.movierental.models.MovieRdbms;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovieRdbmsRepository  extends CrudRepository<MovieRdbms, Long> {
    MovieRdbms findByName(@Param("name") String name);

    //Hibernate Query Language
    @Query(value="SELECT m FROM MovieRdbms m WHERE m.name like %name%")
    List<MovieRdbms> findByNameLike(@Param("name") String name);

    //Native query
    @Query(value= "SELECT * FROM MOVIES WHERE YEAR(RELEASE_DATE) =?1",nativeQuery = true)
    List<MovieRdbms> findByReleaseYear(Integer releaseYear);
}
