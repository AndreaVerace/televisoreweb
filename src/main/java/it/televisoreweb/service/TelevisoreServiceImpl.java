package it.televisoreweb.service;

import java.util.List;

import it.televisoreweb.dao.televisore.TelevisoreDAO;
import it.televisoreweb.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	private TelevisoreDAO televisoreDAO;
	
	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		return televisoreDAO.cercaPerMarcaEModello(marca, modello);
	}

}
