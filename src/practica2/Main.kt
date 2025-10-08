package practica2

fun main(){
    val jugador1= Player("yo",30)
    val potion1 = Potion("curasao",2)
    val sword1 = Sword("flaming",10)
    val sword2 = Sword("flaming",100)


    jugador1.CanAdd(potion1)
    jugador1.TryAdd(potion1)
    jugador1.TryAdd(sword1)
    jugador1.CanAdd(sword2)


    jugador1.ListBackpack()



}