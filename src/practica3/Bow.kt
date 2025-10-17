package practica3

class Bow(override val Name: String, override var Damage: Int,
          override var Weight: Int, override var Slots: Int =2,
          override val canBeUseCondition: (Player) -> Boolean):
    Weapon(Name = Name,Weight=Weight,Slots=Slots,Damage=Damage, canBeUseCondition = canBeUseCondition)