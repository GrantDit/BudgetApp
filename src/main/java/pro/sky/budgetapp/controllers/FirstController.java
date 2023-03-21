package pro.sky.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.awt.SystemColor.info;

@RestController
public class FirstController {
    @GetMapping("/")
    public String helloWorld() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String page() {
        return "Имя ученика: Кирилл ," + " Название проекта: BudgetApp ," + " Дата создани: 21.03.2023 ," + " Описание: Приложение позволит построить бюджет.";
    }
}
