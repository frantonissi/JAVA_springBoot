package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")

//O controller seria o porteiro pra gerenciar quem entra e quem sai e as rotas pra realizar uma acao
public class FoodController {

    //injecao de dependencia
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping //pega informacoes do servidor
    public List<Food> getAll(){
        return foodService.getAll();
    }
    @PostMapping //faz uma requisicao pra mandar pro servidor, pega uma rota pra mandar informacao
    public Food create(@RequestBody Food food){
        return foodService.save(food);
    }
}
