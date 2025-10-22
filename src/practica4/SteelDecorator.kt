package practica4

class SteelDecorator(inner: IWeapon
): IWeapon {
    override val Name = inner.Name
    override var Weight = inner.Weight*0.9
    override var Damage = inner.Damage*1.1
    override var Slots = inner.Slots


}