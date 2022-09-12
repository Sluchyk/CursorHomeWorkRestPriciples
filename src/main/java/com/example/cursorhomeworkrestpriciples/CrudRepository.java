package com.example.cursorhomeworkrestpriciples;

import java.util.List;

public interface CrudRepository {
    Shop create(Shop shop) throws UniequeShopIdException;

    Shop delete(long id) throws NotFoundShopException;

    List<Shop> getAll();

    Shop getById(long id) throws NotFoundShopException;

    Shop updateById(Shop updatedShop) throws NotFoundShopException;

}
