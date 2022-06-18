package Auteur.ms.Auteur.Controller;

import Auteur.ms.Auteur.Entity.Auteur;
import Auteur.ms.Auteur.Service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AuteurController {

    @Autowired
    private AuteurService auteurService;

    @CrossOrigin()
    @GetMapping("/auteur/All")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(auteurService.findAll());
    }
    @CrossOrigin()
    @PostMapping("/auteur")
    public ResponseEntity<?> add(@RequestBody Auteur c) {
        Optional<Auteur> auteur1 = Optional.of(auteurService.add(c));
        return ResponseEntity.created(null).body(auteur1);
    }
    @CrossOrigin()
    @PutMapping("/auteur")
    public ResponseEntity<?> update(@RequestBody Auteur auteur) {

        Auteur auteur1 = auteurService.Update(auteur);
        return ResponseEntity.accepted().body(auteur1);

    }
    @CrossOrigin()
    @DeleteMapping("/auteur/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        auteurService.DeleteById(id);
        return ResponseEntity.noContent().build();
    }
}