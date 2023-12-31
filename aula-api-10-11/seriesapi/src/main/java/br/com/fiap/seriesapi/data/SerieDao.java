package br.com.fiap.seriesapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.seriesapi.model.Serie;

public class SerieDao {

	List<Serie> lista = new ArrayList<>();
	
	public SerieDao() {
		lista.addAll(List.of(
				new Serie(1L, "Lost", "Todos morrem...", "http...", false, 0),
				new Serie(2L, "Treta", "Uma treta começa...", "http...", true, 3),
				new Serie(3L, "Loki", "Ao viajar no tempo...", "http...", true, 7)
		));
	}
	
	public List<Serie> findAll() {
		return lista;
	}

}
