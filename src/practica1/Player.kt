package practica1

class Player (val Name: String, var MaxStrength: Int){
    var BackPack: MutableList<Item> = mutableListOf()
    init {
        println("Player: $Name, MaxStrength: $MaxStrength")
    }

    fun CurrentLoad(): Int {
        var pesoTotal: Int=0
        BackPack.forEach { pesoTotal += it.Peso }

        return pesoTotal
    }

    fun CanAdd(Item: Item): Boolean {
        var can: Boolean = CurrentLoad() + Item.Peso <= MaxStrength
        if (!can){
            println("Cannot add Treasure (+${Item.Peso}). Exceeds by ${CurrentLoad()+Item.Peso-MaxStrength} (${CurrentLoad()}/$MaxStrength).")
        }

        return can

    }

    fun TryAdd(Item: Item){
        println("Added Sword (+${Item.Peso}). Current load: ${Item.Peso+CurrentLoad()}/$MaxStrength")
        BackPack.add(Item)
    }
    fun ListBackpack(){
        print("Backpack: ")
        BackPack.forEach {
            print("${it.Name} ")
        }
        println()
    }
}

