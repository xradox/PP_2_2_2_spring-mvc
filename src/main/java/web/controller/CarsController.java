package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarsService;

import java.util.Objects;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping
    public String index(Model model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("cars", carsService.getCars(Objects.requireNonNullElse(count, 5)));
        return "cars";
    }
}
