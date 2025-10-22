package practica4

class MithrilDecorator(inner: IWeapon
): IWeapon {
    override val Name= inner.Name
    override var Weight = inner.Weight*0.75
    override var Damage = inner.Damage*1.2
    override var Slots = inner.Slots


}