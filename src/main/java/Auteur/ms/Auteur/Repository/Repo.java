package Auteur.ms.Auteur.Repository;

import Auteur.ms.Auteur.Entity.Auteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Auteur,Long> {

}
