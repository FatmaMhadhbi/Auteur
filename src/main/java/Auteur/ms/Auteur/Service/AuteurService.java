package Auteur.ms.Auteur.Service;

import java.util.List;
import Auteur.ms.Auteur.Entity.Auteur;
public interface AuteurService {

    public Auteur add(Auteur auteur);
    public Auteur findById( Long id);
    public List<Auteur> findAll();
    public void DeleteById( Long id);
    public Auteur Update(Auteur auteur);

}

