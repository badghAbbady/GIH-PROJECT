package ma.uiass.eia.pds.backend.Dao;

import ma.uiass.eia.pds.backend.Entite.Lit;

import java.util.List;

public interface ILitDao extends Dao<Lit>{

    public List<Lit> getlitsEspace(int ide);
}
