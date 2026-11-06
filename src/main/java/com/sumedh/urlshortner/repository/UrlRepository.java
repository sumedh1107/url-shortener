package com.sumedh.urlshortner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sumedh.urlshortner.entity.URL;

@Repository
public interface UrlRepository extends JpaRepository<URL, Integer>{

}
