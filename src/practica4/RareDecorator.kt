package practica4

class RareDecorator(inner: IWeapon
): IWeapon {
    override val Name= inner.Name
    override var Weight = inner.Weight
    override var Damage = inner.Damage*1.15
    override var Slots = inner.Slots
}