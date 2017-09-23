package com.techdroit.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techdroit.lms.models.Book;

@Repository
public interface LmsRepository extends CrudRepository<Book, Long>{

}