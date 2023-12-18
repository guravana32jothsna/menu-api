package com.food.fullstackcomplete.controller;

import com.food.fullstackcomplete.model.Menu_db;
import com.food.fullstackcomplete.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu_db")
@CrossOrigin
public class MenuController {
    @Autowired
    private MenuService menuService;
    @PostMapping("/insertData")
    public String add(@RequestBody Menu_db menu_db) {
        menuService.saveMenu_db(menu_db);
        return "Post Method successful";
    }
    @GetMapping("/getAll")
    public List<Menu_db> getAllMenu() {
        return menuService.getAllMenu_db();
    }

    @GetMapping("{fId}")
    public Menu_db getById(@PathVariable("fId") Integer id) {
        return menuService.getMenu_db(id);
    }

    @DeleteMapping("{fId}")
    public String deleteMenuItem(@PathVariable("fId") Integer fId) {
        menuService.deleteMenu_db(fId);
        return "Deleted Item successfully";
    }
    @PutMapping
    public String updateMenu(@RequestBody Menu_db menu_db) {
        menuService.updateMenu_db(menu_db);
        return "Updated";
    }

}
