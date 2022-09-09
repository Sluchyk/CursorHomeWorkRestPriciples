package com.example.cursorhomeworkrestpriciples;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {
    final private ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> create(@RequestBody Shop shop) {
        try {
            shopService.create(shop);
            return new ResponseEntity<>("Has created", HttpStatus.CREATED);
        } catch (UniequeShopIdException e) {
            return new ResponseEntity<>("Something was going  wrong", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        try {
            shopService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NotFoundException e) {
            return new ResponseEntity<>("Something was going wrong", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all")
    public List<Shop> getAll() {
        return shopService.getAll();
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<String> getById(@PathVariable long id) {
        Shop shop;
        try {
            shop = shopService.getById(id);

            return new ResponseEntity<>(shop.toString(), HttpStatus.OK);
        } catch (NotFoundException e) {
            return new ResponseEntity<>("Something was going wrong,try again", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateById(Shop updatedShop) {
        try {
            shopService.updateById(updatedShop);
            return new ResponseEntity<>("Has updated", HttpStatus.OK);
        } catch (NotFoundException e) {
            return new ResponseEntity<>("Something was going wrong,try again", HttpStatus.NOT_FOUND);
        }
    }
}
