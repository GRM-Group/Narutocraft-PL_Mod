package pl.grm.narutocraft.items.weapons;

import pl.grm.narutocraft.libs.config.Materials;

public class Machete extends SwordMain{
	public Machete(){
		super(Materials.tytan6);
		this.setAttackDamage(14);
		this.setMaxDamage(600);
	}
}
