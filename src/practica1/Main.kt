package practica1

fun main(){
    val jugador1= Player("yo",30)


    jugador1.TryAdd(Item("sword",10))
    jugador1.TryAdd(Item("sword",15))

    println(jugador1.ListBackpack())



}