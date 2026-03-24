package org.example.controller;

import org.example.model.Math;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/fibonacci")
    public Math fibpar(@RequestParam int value) {
        List<Integer> fibList = new ArrayList<>();

        if (value >= 0) fibList.add(0);
        if (value >= 1) fibList.add(0);
        if (value >= 2) fibList.add(1);   

        for (int i = 3; i <= value; i++){
            int siguiente = fibList.get(i-1) + fibList.get(i-2) + fibList.get(i-3);
            fibList.add(siguiente);
        }

        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < fibList.size(); i++) {
            salida.append(fibList.get(i));
            if (i != fibList.size() - 1) {
                salida.append(", ");
            }
        }

        return new Math("Fibonnacci:", value, salida.toString());
    }
}
