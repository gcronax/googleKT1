package practica1

fun main(){
    val jugador1= Player("yo",30)

    jugador1.CanAdd(Item("manzana",40))
    jugador1.TryAdd(Item("pera",10))
    jugador1.TryAdd(Item("sword",15))
    jugador1.CanAdd(Item("manzana",40))


    jugador1.ListBackpack()



}