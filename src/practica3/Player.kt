package practica3

 class Player (var MaxStrength: Int,var Slots: Int){
    var BackPack: MutableList<IPickable> = mutableListOf()
//    init {
//        println("Player: $Name, MaxStrength: $MaxStrength")
//    }

    fun CurrentLoad(): Int {
        var pesoTotal: Int=0
        BackPack.forEach { pesoTotal += it.Weight }

        return pesoTotal
    }

    fun CanAdd(pickable: IPickable): Boolean {
        var can: Boolean = CurrentLoad() + pickable.Weight <= MaxStrength
        if (!can){
            println("Cannot add Treasure (+${pickable.Weight}). " +
                    "Exceeds by ${CurrentLoad()+pickable.Weight- MaxStrength}" +
                    " (${CurrentLoad()}/$MaxStrength).")
        }

        return can

    }

    fun TryAdd(pickable: IPickable){
        println("Added ${pickable.Name} (+${pickable.Weight})." +
                " Current load: ${pickable.Weight+CurrentLoad()}/$MaxStrength")
        BackPack.add(pickable)
    }
    fun ListBackpack(){
        print("Backpack: ")
        BackPack.forEach {
            print("${it.Name} ")
        }
        println()
    }
}

