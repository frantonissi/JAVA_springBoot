package dev.java10x.Fridge.repository;

import dev.java10x.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

//contador pra saber quem entra e quem sai, se conecta com o banco de dados
public interface FoodRepository extends JpaRepository<Food, Long> {



}
