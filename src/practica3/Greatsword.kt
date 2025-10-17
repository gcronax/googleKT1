package practica3

class Greatsword(override val Name: String, override var Damage: Int,
                 override var Weight: Int, override var Slots: Int =4):
    Weapon(Name = Name,Weight=Weight,Slots=Slots,Damage=Damage)