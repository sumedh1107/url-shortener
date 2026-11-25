package com.sumedh.urlshortner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sumedh.urlshortner.entity.URL;
import java.util.List;
import java.util.Optional;


@Repository
public interface UrlRepository extends JpaRepository<URL, Integer>{
	public boolean existsByShortCode(String shortCode);
	public Optional<URL> findByShortCode(String shortCode);

}
