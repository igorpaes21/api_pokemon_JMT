package br.senai.pokedex.api_pokemon.service;

import br.senai.pokedex.api_pokemon.model.entity.Pokedex;
import br.senai.pokedex.api_pokemon.repository.PokedexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokedexService {

    @Autowired
    PokedexRepository pokedexRepository;

    public List<Pokedex> readyPokedex() {
        return pokedexRepository.findAll();
    }

    public Pokedex create(Pokedex pokedex) {
        return pokedexRepository.save(pokedex);

    }

    public Pokedex update(Long id, Pokedex pokedexUpdate) {
        Optional <Pokedex> pokedexOptional = pokedexRepository.findById(id);

        if (pokedexOptional.isPresent()){
            Pokedex pokedex = pokedexOptional.get();
            pokedex.setNome(pokedexUpdate.getNome());
            pokedex.setDescricao(pokedexUpdate.getDescricao());
            pokedex.setTipo(pokedexUpdate.getTipo());
            pokedex.setCategoria(pokedexUpdate.getCategoria());
            pokedex.setAltura(pokedexUpdate.getAltura());
            pokedex.setPeso(pokedexUpdate.getPeso());

            return pokedexRepository.save(pokedex);
        } else {
            throw new RuntimeException("Pokémon não encontrado" + id);
        }
    }

    public void delete(Long id) {
        pokedexRepository.deleteById(id);
    }

    public Optional<Pokedex> findById(Long id) {
        return pokedexRepository.findById(id);
    }

    public List<Pokedex> findByNome(String nome) {
        return pokedexRepository.findByNome(nome);
    }
}
