package com.illichtech.di

import com.illichtech.repository.ProductRepository
import com.illichtech.repository.ProductRepositoryImpl
import org.koin.dsl.module


val koinModule = module {
    single<ProductRepository> {
        ProductRepositoryImpl()
    }
}