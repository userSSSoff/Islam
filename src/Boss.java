public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public java.lang.String info() {
        return "HP " + getHeight() + "\nDAMAGE " + getDamage() + "\nweaponName " + weapon.getWeaponName() +
                "\nWeaponType " + weapon.getWeaponType();
    }


}
