package practica3

import practica2.Sword

fun main(){
    val player1= Player(30,40)
    val sword1 = Sword("flaming",1,1,2)
    val sword2 = Sword("flaming",100,155,5)
    val flecha1 = Arrow("flecha",1,1)

    val bow1= Bow("arco",1,2,1 )


    player1.TryAdd(flecha1)
    println(
        if (bow1.CanBeUsedBy(player1)) "si"
        else "no"
    )




    player1.TryAdd(sword1)
    player1.CanAdd(sword2)


    player1.ListBackpack()





}