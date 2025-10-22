package practica4

fun main() {

    val player1= Player(30,40)
    val sword= EpicDecorator(MithrilDecorator(basicSword("espada",2.2,2.2,2)))
    val bow= RareDecorator(SteelDecorator(basicSword("arco",2.2,2.2,2)))

    player1.TryAdd(sword)
    player1.TryAdd(bow)

    println("${sword.Damage}  daño - peso  ${sword.Weight} ")
    println("${bow.Damage}  daño - peso  ${bow.Weight} ")




}