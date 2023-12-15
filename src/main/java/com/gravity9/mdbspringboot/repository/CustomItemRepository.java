package com.gravity9.mdbspringboot.repository;

public interface CustomItemRepository {

    void updateItemQuantity(String name, float newQuantity);

}