package practica1

class Player (val Name: String, var MaxStrength: Int){
    var BackPack: MutableList<Item> = mutableListOf()

    fun CurrentLoad(): Int {
        var pesoTotal: Int=0
        BackPack.forEach { pesoTotal += it.Peso }

        return pesoTotal
    }

    fun CanAdd(Item: Item): Boolean {
        return CurrentLoad() + Item.Peso <= MaxStrength
    }

    fun TryAdd(Item: Item){
        BackPack.add(Item)
    }
    fun ListBackpack(){
        BackPack.forEach {
            print(it.Name)
            println(it.Peso)  }

    }
}

