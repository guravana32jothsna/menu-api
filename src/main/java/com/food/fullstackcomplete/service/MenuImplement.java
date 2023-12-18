package com.food.fullstackcomplete.service;

import com.food.fullstackcomplete.model.Menu_db;
import com.food.fullstackcomplete.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuImplement implements MenuService{
    @Autowired
    private MenuRepo menuRepo;
    @Override
    public Menu_db saveMenu_db(Menu_db menu_db) {
        return menuRepo.save(menu_db);
    }

    @Override
    public String deleteMenu_db(Integer id) {
        menuRepo.deleteById(id);
        return "Deleted menu-item from db";
    }

    @Override
    public Menu_db getMenu_db(Integer id) {
        return menuRepo.findById(id).get();
    }

    @Override
    public String updateMenu_db(Menu_db menu_db) {
        menuRepo.save(menu_db);
        return "Updated an Item";
    }

    @Override
    public List<Menu_db> getAllMenu_db() {
        return menuRepo.findAll();
    }
}
