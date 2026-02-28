package dev.java10x.Fridge.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

//O model funciona como o objeto de acao, nesse caso a comida
@Entity//anotation que fala que a entidade(objeto) é uma entidade no banco de dados
@Table(name = "food_table")//define qual o nome da tabela no banco de dados
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  Integer quantity;
    private LocalDate expirationDate;

    public Food() {
    }

    public Food(String name, Integer quantity, LocalDate expirationDate, Long id) {
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
