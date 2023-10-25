package br.com.fiap.seriesapi.service;

import java.util.List;

import br.com.fiap.seriesapi.data.SerieDao;
import br.com.fiap.seriesapi.model.Serie;

public class SerieService {
	
	SerieDao dao = new SerieDao();

	public List<Serie> findAll() {
		return dao.findAll();
	}

	public Serie findById(Long id) {
		return dao.findById(id);
	}

	public void delete(Long id) {
		dao.delete(id);
	}

	public boolean create(Serie serie) {
		if(!validar(serie)) return false;
		
		dao.create(serie);
		return true;
		
	}

	//verificar requisitos
	private boolean validar(Serie serie) {
		//titulo vazio
		if (serie.titulo().isEmpty()) return false;
		// nota menor que 0 e maior que 5
		if (serie.nota() < 0 || serie.nota() > 5) return false;
		//minimo de caracteres = 10
		if (serie.sinopse().length() < 10) return false;
		// nao começa com http (http://site.com/poster.jpg)
		if(!serie.poster().startsWith("http")) return false;
		
		return true;
	}

	public boolean update(Serie serie) {
		if(!validar(serie)) return false;
		
		dao.update(serie);
		return true;
		
	}

}
