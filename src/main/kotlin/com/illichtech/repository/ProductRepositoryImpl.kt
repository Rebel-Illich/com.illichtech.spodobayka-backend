package com.illichtech.repository

import com.illichtech.models.ApiResponse
import com.illichtech.models.Product

class ProductRepositoryImpl: ProductRepository {

    override val goods: List<Product> = listOf(
        Product(
            id = 4,
            name = "Boruto",
            image = "/images/amado.png",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties.",
            rating = 4.9,
            priceBefore = "41",
            priceCurrent = "23",
            specialOffer = "255"
        ),
        Product(
            id = 5,
            name = "Sarada",
            image = "/images/amado.jpg",
            about = "Sarada Uchiha (うちはサラダ, Uchiha Sarada) is a kunoichi from Konohagakure's Uchiha clan. Because she was raised only by her mother without having her father around, Sarada initially struggles to understand who she is or what she's supposed to be. After meeting him with the help of Naruto Uzumaki, Sarada comes to believe that she is defined by the connections she has with others, and as a member of Team Konohamaru, she seeks to someday become Hokage so that she can connect with as many people as possible.",
            rating = 4.9,
            priceBefore = "41",
            priceCurrent = "38",
            specialOffer = "12%"
        ),
        Product(
            id = 6,
            name = "Mitsuki",
            image = "/images/amado.jpg",
            about = "Mitsuki (ミツキ, Mitsuki) is a synthetic human that was created as a partial clone of Orochimaru. Immigrating to Konohagakure to confirm whether or not Boruto Uzumaki was his \"sun\", he became a shinobi and was placed on Team Konohamaru. Mitsuki was created as a clone of Orochimaru, being cultivated from the same embryo as at least one older \"Mitsuki\", and raised in a test tube.",
            rating = 4.9,
            priceBefore = "36",
            priceCurrent = "32",
            specialOffer = "14%"
        ),
        Product(
            id = 1,
            name = "Table",
            image = "/images/amado.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 2.3,
            priceBefore = "22",
            priceCurrent = "15",
            specialOffer = "25%"
        ),
        Product(
            id = 2,
            name = "Uzumaki",
            image = "/images/amado.jpg",
            about = "Uzumaki (うずまきナルト, Uzumaki Naruto) is a shinobi of Konohagakure's Uzumaki clan. He became the jinchūriki of the Nine-Tails on the day of his birth — a fate that caused him to be shunned by most of Konoha throughout his childhood. After joining Team Kakashi, Naruto worked hard to gain the village's acknowledgement all the while chasing his dream to become Hokage.",
            rating = 5.0,
            priceBefore = "41",
            priceCurrent = "23",
            specialOffer = "10%"
        ),
        Product(
            id = 3,
            name = "Sakura",
            image = "/images/amado.jpg",
            about = "Sakura Uchiha (うちはサクラ, Uchiha Sakura, née Haruno (春野)) is a kunoichi of Konohagakure. When assigned to Team 7, Sakura quickly finds herself ill-prepared for the duties of a shinobi. However, after training under the Sannin Tsunade, she overcomes this, and becomes recognised as one of the greatest medical-nin in the world.",
            rating = 4.5,
            priceBefore = "41",
            priceCurrent = "23",
            specialOffer = "255"
        ),
        Product(
            id = 4,
            name = "Boruto",
            image = "/images/amado.png",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties.",
            rating = 4.9,
            priceBefore = "41",
            priceCurrent = "23",
            specialOffer = "255"
        ),
        Product(
            id = 5,
            name = "Sarada",
            image = "/images/amado.jpg",
            about = "Sarada Uchiha (うちはサラダ, Uchiha Sarada) is a kunoichi from Konohagakure's Uchiha clan. Because she was raised only by her mother without having her father around, Sarada initially struggles to understand who she is or what she's supposed to be. After meeting him with the help of Naruto Uzumaki, Sarada comes to believe that she is defined by the connections she has with others, and as a member of Team Konohamaru, she seeks to someday become Hokage so that she can connect with as many people as possible.",
            rating = 4.9,
            priceBefore = "41",
            priceCurrent = "38",
            specialOffer = "12%"
        ),
        Product(
            id = 6,
            name = "Mitsuki",
            image = "/images/amado.jpg",
            about = "Mitsuki (ミツキ, Mitsuki) is a synthetic human that was created as a partial clone of Orochimaru. Immigrating to Konohagakure to confirm whether or not Boruto Uzumaki was his \"sun\", he became a shinobi and was placed on Team Konohamaru. Mitsuki was created as a clone of Orochimaru, being cultivated from the same embryo as at least one older \"Mitsuki\", and raised in a test tube.",
            rating = 4.9,
            priceBefore = "36",
            priceCurrent = "32",
            specialOffer = "14%"
        ),
        Product(
            id = 4,
            name = "Boruto",
            image = "/images/amado.png",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties.",
            rating = 4.9,
            priceBefore = "41",
            priceCurrent = "23",
            specialOffer = "255"
        ),
        Product(
            id = 5,
            name = "Sarada",
            image = "/images/amado.jpg",
            about = "Sarada Uchiha (うちはサラダ, Uchiha Sarada) is a kunoichi from Konohagakure's Uchiha clan. Because she was raised only by her mother without having her father around, Sarada initially struggles to understand who she is or what she's supposed to be. After meeting him with the help of Naruto Uzumaki, Sarada comes to believe that she is defined by the connections she has with others, and as a member of Team Konohamaru, she seeks to someday become Hokage so that she can connect with as many people as possible.",
            rating = 4.9,
            priceBefore = "41",
            priceCurrent = "38",
            specialOffer = "12%"
        ),
        Product(
            id = 6,
            name = "Mitsuki",
            image = "/images/amado.jpg",
            about = "Mitsuki (ミツキ, Mitsuki) is a synthetic human that was created as a partial clone of Orochimaru. Immigrating to Konohagakure to confirm whether or not Boruto Uzumaki was his \"sun\", he became a shinobi and was placed on Team Konohamaru. Mitsuki was created as a clone of Orochimaru, being cultivated from the same embryo as at least one older \"Mitsuki\", and raised in a test tube.",
            rating = 4.9,
            priceBefore = "36",
            priceCurrent = "32",
            specialOffer = "14%"
        ),
        Product(
            id = 4,
            name = "Boruto",
            image = "/images/amado.png",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties.",
            rating = 4.9,
            priceBefore = "41",
            priceCurrent = "23",
            specialOffer = "255"
        ),
        Product(
            id = 5,
            name = "Sarada",
            image = "/images/amado.jpg",
            about = "Sarada Uchiha (うちはサラダ, Uchiha Sarada) is a kunoichi from Konohagakure's Uchiha clan. Because she was raised only by her mother without having her father around, Sarada initially struggles to understand who she is or what she's supposed to be. After meeting him with the help of Naruto Uzumaki, Sarada comes to believe that she is defined by the connections she has with others, and as a member of Team Konohamaru, she seeks to someday become Hokage so that she can connect with as many people as possible.",
            rating = 4.9,
            priceBefore = "41",
            priceCurrent = "38",
            specialOffer = "12%"
        ),
        Product(
            id = 6,
            name = "Mitsuki",
            image = "/images/amado.jpg",
            about = "Mitsuki (ミツキ, Mitsuki) is a synthetic human that was created as a partial clone of Orochimaru. Immigrating to Konohagakure to confirm whether or not Boruto Uzumaki was his \"sun\", he became a shinobi and was placed on Team Konohamaru. Mitsuki was created as a clone of Orochimaru, being cultivated from the same embryo as at least one older \"Mitsuki\", and raised in a test tube.",
            rating = 4.9,
            priceBefore = "36",
            priceCurrent = "32",
            specialOffer = "14%"
        )

    )

    override suspend fun getAllProducts(page: Int, limit: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                products = goods,
                page = page,
                limit = limit
            )["prevPage"],
            nextPage = calculatePage(
                products = goods,
                page = page,
                limit = limit
            )["nextPage"],
            products = provideProducts(
                page = page,
                limit = limit,
                product = goods
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        products: List<Product>,
        page: Int,
        limit: Int
    ): Map<String, Int?>{

        val allProducts = products.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allProducts.size)

        val prevPage = if (page == 1) null else page - 1
        val nextPage = if (page == allProducts.size) null else page + 1

        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
         )
    }

    private fun provideProducts(
        product: List<Product>,
        page: Int,
        limit: Int
    ): List<Product> {
        val allProducts = product.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allProducts.size)
        return allProducts[page - 1]
    }

    private fun findProduct(query: String?): List<Product>{
        val founded = mutableListOf<Product>()
        return if(!query.isNullOrEmpty()){
            goods.forEach{ product ->
                if (product.name.lowercase().contains(query.lowercase())){
                    founded.add(product)
                }
            }
            founded
        } else {
            emptyList()
        }
    }

    override suspend fun searchProducts(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            products = findProduct(query = name)
        )
    }
}