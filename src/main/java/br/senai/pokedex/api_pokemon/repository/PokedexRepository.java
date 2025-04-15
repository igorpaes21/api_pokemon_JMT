package br.senai.pokedex.api_pokemon.repository;

import br.senai.pokedex.api_pokemon.model.entity.Pokedex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokedexRepository  extends JpaRepository<Pokedex, Long> {

    List<Pokedex> findByNome(String nome);
}
