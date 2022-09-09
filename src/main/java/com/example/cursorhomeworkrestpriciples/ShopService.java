package com.example.cursorhomeworkrestpriciples;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ShopService implements CrudIterface {
    private final List<Shop> shops = new ArrayList<>();

    @Override
    public Shop create(Shop shop) throws UniequeShopIdException {
        for(Shop shop1 :shops)
        {
            if(shop1.getId()==shop.getId())
            {
                throw  new UniequeShopIdException(shop.getName()+" has already existed");
            }
        }
        shops.add(shop);
        return  shop;
    }

    @Override
    public Shop delete(long id) throws NotFoundException {
        Shop shop = getById(id);
        shops.remove(shop);
        return shop;
    }

    @Override
    public List<Shop> getAll() {
        return shops;
    }

    @Override
    public Shop getById(long id) throws NotFoundException {
        for (Shop shop : shops) {
            if (shop.getId() == id) {

                return shop;
            }
        }
        throw new NotFoundException("Not Found Shop with id: " +id);
    }

    @Override
    public Shop updateById(Shop updatedShop) throws NotFoundException {
        for(Shop shop : shops) {
          if(shop.getId()==updatedShop.getId())
          {
              shop=updatedShop;
              return  shop;
          }
        }
        throw  new NotFoundException("Not Found Shop with id: "+updatedShop.getId());
    }
}
