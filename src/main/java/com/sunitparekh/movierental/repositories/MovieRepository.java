package com.sunitparekh.movierental.repositories;

import com.sunitparekh.movierental.models.MovieRdbms;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository
       extends CrudRepository<MovieRdbms,Long>
{

}
