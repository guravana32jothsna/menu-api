package com.food.fullstackcomplete.service;

import com.food.fullstackcomplete.model.Menu_db;

import java.util.List;

public interface MenuService {
    public Menu_db saveMenu_db(Menu_db menu_db);
    public List<Menu_db> getAllMenu_db();
    public String deleteMenu_db(Integer id);
    public String updateMenu_db(Menu_db menu_db);
    public Menu_db getMenu_db(Integer id);

}
