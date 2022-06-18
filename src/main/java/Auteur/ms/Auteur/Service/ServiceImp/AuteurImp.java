package Auteur.ms.Auteur.Service.ServiceImp;

import Auteur.ms.Auteur.Service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import Auteur.ms.Auteur.Entity.Auteur;
import Auteur.ms.Auteur.Repository.Repo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AuteurImp implements AuteurService {
    @Autowired
    Repo auteurRepository;


    @Override
    public Auteur add(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public Auteur findById(Long id) {
        return auteurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Auteur> findAll() {
        return (List<Auteur>) auteurRepository.findAll();
    }

    @Override
    public void DeleteById(Long id) {
        auteurRepository.deleteById(id);
    }
    @Override
    public Auteur Update(Auteur auteur){
        return auteurRepository.save(auteur);
    }
}
