package com.esco.entregaspring;

import com.esco.entregaspring.model.Doujinshi;

import java.util.List;
import java.util.Optional;

public interface DoujinshiService {
	List<Doujinshi> findAll();
	Optional<Doujinshi> findById(Long id);
	void saveDoujinshi(Doujinshi doujinshi);
	Doujinshi updateDoujinshi(Long id, Doujinshi doujinshi);
	void deleteDoujinshiById(Long id);

}
