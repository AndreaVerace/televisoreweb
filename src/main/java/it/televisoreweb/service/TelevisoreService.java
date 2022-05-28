package it.televisoreweb.service;

import java.util.List;

import it.televisoreweb.dao.televisore.TelevisoreDAO;
import it.televisoreweb.model.Televisore;

public interface TelevisoreService {

	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);
	
	public List<Televisore> cercaPerMarcaEModello(String marca,String modello);
	
}
