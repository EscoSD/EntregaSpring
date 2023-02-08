package com.esco.entregaspring;

import com.esco.entregaspring.model.Doujinshi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {
	@Autowired
	private DoujinshiServiceImpl service;

	@PostMapping("/addDoujin")
	void altaDoujinshi(Doujinshi doujinshi) {
		service.saveDoujinshi(doujinshi);
	}

	@GetMapping("/listDoujins")
	List<Doujinshi> listaDoujinshis() {
		return service.findAll();
	}

	@GetMapping("/getOneDoujin")
	Doujinshi findById(Long id) {
		// Devuelve el Doujinshi en caso de encontrarse en la base de datos
		// En caso contrario, devuelve null.
		return service.findById(id).orElse(null);
	}

	@PutMapping("/updateDoujin/{id}")
	Doujinshi updateDoujinshi(@PathVariable("id") Long id, Doujinshi doujinshi) {
		// En caso de encontrar el Doujin, se actualiza y se devuelve el resultado
		// En caso contrario, devuelve null.
		return service.findById(id).isPresent() ? service.updateDoujinshi(id, doujinshi) : null;
	}

	@DeleteMapping("/deleteDoujin")
	void deleteDoujin(Long id) {
		service.deleteDoujinshiById(id);
	}
}
