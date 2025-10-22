package practica3

class Crossbow(override val Name: String, override var Damage: Int,
               override var Weight: Int, override var Slots: Int =2, ):
    Weapon(Name = Name,Weight=Weight,Slots=Slots,Damage=Damage, canBeUseCondition = {p -> p.BackPack.any{ it is Bolt }})