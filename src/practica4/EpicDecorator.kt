package practica4

class EpicDecorator(inner: IWeapon): IWeapon {
    override val Name= inner.Name
    override var Weight = inner.Weight
    override var Damage = inner.Damage*1.3
    override var Slots = inner.Slots
}