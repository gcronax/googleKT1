package practica3

open class Weapon(override val Name: String, open var Damage: Int=1,
                  override var Weight: Int=1, override var Slots: Int=1,
                  open val canBeUseCondition: (Player) -> Boolean = {p -> true}
): IPickable, IUsable {

    override fun CanBeUsedBy(player: Player): Boolean = canBeUseCondition(player)

    fun GetWeight(): Int{
        return Weight
    }
    fun GetDamage(): Int{
        return Damage
    }
    fun GetSlots(): Int{
        return  Weight
    }


}