package it.televisoreweb.dao.televisore;

import java.util.List;

import it.televisoreweb.dao.IBaseDAO;
import it.televisoreweb.model.Televisore;

public interface TelevisoreDAO extends IBaseDAO<Televisore> {

	public List<Televisore> cercaPerMarcaEModello(String marca,String modello);
	
}
