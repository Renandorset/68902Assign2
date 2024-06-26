package com.example.renanbarbosa68902

import kotlin.random.Random

object MovieListHolder {
    var movieItems = mutableListOf(
        MovieItem(
            "THE FIRST OMEN",
            "https://www.myvue.com/-/jssmedia/vuecinemas/carousel-artwork/april-24/thefirstomen_vue_homepagehero_1584x540_now.jpg?mw=1600&rev=bbd231fb564d47f0b15eca5c8d4a1590",
            "16",
            "When a young American woman is sent to Rome to begin a life of service to the church, she encounters a darkness that causes her to question her own faith.",
            arrayListOf("Bill Nighy", "Ralph Ineson", "Sônia Braga", "Nell Tiger Free", "Tawfeek Barhom"),
            119,
            Random.nextInt(0, 16),
            0
        ),
        MovieItem(
            "KUNG FU PANDA 4",
            "https://www.myvue.com/-/media/vuecinemas/carousel-artwork/value-aw/kfp4/kungfupanda4valuebannerie5991584x540.jpg?h=540&iar=0&w=1584&rev=56b0d7420d374222b4423973cd58973d",
            "PG",
            "After Po is tapped to become the Spiritual Leader of the Valley of Peace, he needs to find and train a new Dragon Warrior, while a wicked sorceress plans to re-summon all the master villains whom Po has vanquished to the spirit realm.",
            arrayListOf("Jack Black", "Awkwafina", "Viola David", "Dustin Hoffman", "Bryan Cranston", "Mr. Beast"),
            94,
            Random.nextInt(0, 16),
            0
        ),
        MovieItem(
            "GODZILLA X KONG: THE NEW EMPIRE",
            "https://www.myvue.com/-/jssmedia/vuecinemas/film-and-events/mar-2024/godzilla-d.jpg?mw=1024&rev=16e46fe47d4a4f6392821e550152a640",
            "12A",
            "The new installment in the Monsterverse puts the mighty Kong and the fearsome Godzilla against a colossal deadly threat hidden within our world.",
            arrayListOf("Rebecca Hall", "Dan Stevens", "Brian Tyree Henry", "Fala Chen", "Kaylee Hottle", "Alex Ferns"),
            115,
            Random.nextInt(0, 16),
            0
        ),
        MovieItem(
            "MONKEY MAN",
            "https://www.myvue.com/-/jssmedia/vuecinemas/carousel-artwork/april-24/mkm_vue_herohomepage_1584x540_aw-3_now.jpg?mw=1600&rev=a3b82d72b1584ba081927154672076b9",
            "16",
            "Oscar® nominee Dev Patel (Lion, Slumdog Millionaire) achieves an astonishing, tour-de-force feature directing debut with an action thriller about one man’s quest.",
            arrayListOf("Sharlto Copley", "Dev Patel", "Sobhita Dhulipala", "Ashwini Kalsekar", "Adithi Kalkunte", "Sikandar Kher", "Pitobash", "Vipin Sharma", "Makarand Deshpande"),
            121,
            Random.nextInt(0, 16),
            0
        )
    )
}