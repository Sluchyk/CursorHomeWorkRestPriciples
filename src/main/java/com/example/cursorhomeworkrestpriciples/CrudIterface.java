package com.example.cursorhomeworkrestpriciples;

import java.util.List;

public interface CrudIterface {
    Shop create(Shop shop) throws UniequeShopIdException;

    Shop delete(long id) throws NotFoundException;

    List<Shop> getAll();

    Shop getById(long id) throws NotFoundException;

    Shop updateById(Shop updatedShop) throws NotFoundException;

}
