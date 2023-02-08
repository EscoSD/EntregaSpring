package com.esco.entregaspring;

import com.esco.entregaspring.model.Doujinshi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoujinshiServiceImpl implements DoujinshiService{

	@Autowired
	private DoujinshiRepository doujinshiRepository;

	@Override
	public List<Doujinshi> findAll() {
		return (List<Doujinshi>) doujinshiRepository.findAll();
	}

	@Override
	public Optional<Doujinshi> findById(Long id) {
		return doujinshiRepository.findById(id);
	}

	@Override
	public void saveDoujinshi(Doujinshi doujinshi) {
		doujinshiRepository.save(doujinshi);
	}

	@Override
	public Doujinshi updateDoujinshi(Long id, Doujinshi doujinshi) {
		if (doujinshiRepository.findById(id).isPresent())
			doujinshiRepository.save(doujinshi);
		return doujinshi;
	}

	@Override
	public void deleteDoujinshiById(Long id) {
		doujinshiRepository.deleteById(id);
	}
}
