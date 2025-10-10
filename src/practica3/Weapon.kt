package practica3

open class Weapon(override val Name: String, override var Weight: Int, override var Slots: Int,
             val canBeUseCondition: (Player) -> Boolean): IPickable, IUsable {

    override fun CanBeUsedBy(player: Player): Boolean = canBeUseCondition(player)

}