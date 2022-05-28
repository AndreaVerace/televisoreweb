package it.televisoreweb.service;

import java.util.List;

import it.televisoreweb.dao.televisore.TelevisoreDAO;
import it.televisoreweb.model.Televisore;

public interface TelevisoreService {

	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);
	
	public List<Televisore> cercaPerMarcaEModello(String marca,String modello);
	
	public Televisore get(Long id) throws Exception;
	
	public void inserisciNuovo(Televisore input) throws Exception;
	
	public List<Televisore> elencoTutti() throws Exception;
	
	public void eliminaEsistente(Televisore input) throws Exception;
	
	public void update(Televisore input) throws Exception;
	
}
