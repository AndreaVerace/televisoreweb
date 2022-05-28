package it.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.televisoreweb.dao.DB_Mock;
import it.televisoreweb.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {

	@Override
	public List<Televisore> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setConnection(Connection connection) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		List<Televisore> result = new ArrayList<>();
		
		for(Televisore tele : DB_Mock.LISTA_TELEVISORI) {
			if(tele.getMarca().startsWith(marca) && tele.getModello().startsWith(modello)) {
				result.add(tele);
			}
		}
		return result;
	}

}