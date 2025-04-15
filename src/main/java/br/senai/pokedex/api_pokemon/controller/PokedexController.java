package br.senai.pokedex.api_pokemon.controller;

import br.senai.pokedex.api_pokemon.model.entity.Pokedex;
import br.senai.pokedex.api_pokemon.service.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon")
public class PokedexController {

    @Autowired
    private PokedexService pokedexService;

    @GetMapping
    public ResponseEntity<List> list() {
        List<Pokedex> pokedex = this.pokedexService.readyPokedex();
        return pokedex.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(pokedex);
    }

    @PostMapping
    public ResponseEntity<Pokedex> create(@RequestBody Pokedex pokedex) throws Exception {
        this.pokedexService.create(pokedex);
        return ResponseEntity.status(HttpStatus.CREATED).body(pokedex);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Pokedex pokedex) throws Exception {
        Pokedex pokedexUpdate = this.pokedexService.update(id, pokedex);
        return ResponseEntity.ok("Pokemon atualizado com sucesso");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        this.pokedexService.delete(id);
        return ResponseEntity.ok("Pokémon deletado com sucesso");
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Pokedex> getById(@PathVariable Long id) {
        Optional<Pokedex> pokedexOptional = pokedexService.findById(id);
        return pokedexOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
