package pl.grm.narutocraft.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pl.grm.narutocraft.NarutoCraft;
import pl.grm.narutocraft.items.DScroll;
import pl.grm.narutocraft.items.EScroll;
import pl.grm.narutocraft.items.FScroll;
import pl.grm.narutocraft.items.HScroll;
import pl.grm.narutocraft.items.KScroll;
import pl.grm.narutocraft.items.NScroll;
import pl.grm.narutocraft.items.RScroll;
import pl.grm.narutocraft.items.Rin;
import pl.grm.narutocraft.items.SScroll;
import pl.grm.narutocraft.items.weapons.BigKunai;
import pl.grm.narutocraft.items.weapons.BushidoKatana;
import pl.grm.narutocraft.items.weapons.ChioRyuuGatana;
import pl.grm.narutocraft.items.weapons.DoubleKusarigama;
import pl.grm.narutocraft.items.weapons.Kama;
import pl.grm.narutocraft.items.weapons.Katana;
import pl.grm.narutocraft.items.weapons.Kubikiribocho;
import pl.grm.narutocraft.items.weapons.Kurosawa;
import pl.grm.narutocraft.items.weapons.KusariFuuboo;
import pl.grm.narutocraft.items.weapons.Kusarigama;
import pl.grm.narutocraft.items.weapons.Kusarigamawithpiston;
import pl.grm.narutocraft.items.weapons.LightBomb;
import pl.grm.narutocraft.items.weapons.Mine;
import pl.grm.narutocraft.items.weapons.Nunchaku;
import pl.grm.narutocraft.items.weapons.Raitanto;
import pl.grm.narutocraft.items.weapons.RyuuKatana;
import pl.grm.narutocraft.items.weapons.SamuraiSword;
import pl.grm.narutocraft.items.weapons.Scalpel;
import pl.grm.narutocraft.items.weapons.ShellRockMace;
import pl.grm.narutocraft.items.weapons.SmokeBomb;
import pl.grm.narutocraft.items.weapons.StoneSword;
import pl.grm.narutocraft.items.weapons.TaishouSword;
import pl.grm.narutocraft.items.weapons.Tanto;
import pl.grm.narutocraft.items.weapons.Wakizashi;
import pl.grm.narutocraft.items.weapons.WarKunai;
import pl.grm.narutocraft.items.weapons.Weights;
import pl.grm.narutocraft.items.weapons.projectiles.BigShuriken;
import pl.grm.narutocraft.items.weapons.projectiles.DoubleKunai;
import pl.grm.narutocraft.items.weapons.projectiles.ExplodeKunai;
import pl.grm.narutocraft.items.weapons.projectiles.FuumaShuriken;
import pl.grm.narutocraft.items.weapons.projectiles.KumoShuriken;
import pl.grm.narutocraft.items.weapons.projectiles.Kunai;
import pl.grm.narutocraft.items.weapons.projectiles.PoisonedSenbon;
import pl.grm.narutocraft.items.weapons.projectiles.Senbon;
import pl.grm.narutocraft.items.weapons.projectiles.Shuriken;
import pl.grm.narutocraft.libs.config.Materials;
import pl.grm.narutocraft.libs.config.References;

public class RegItems extends NarutoCraft {

	public static Item FScroll = new FScroll();
	public static Item KScroll = new KScroll();
	public static Item DScroll = new DScroll();
	public static Item SScroll = new SScroll();
	public static Item RScroll = new RScroll();
	public static Item HScroll = new HScroll();
	public static Item EScroll = new EScroll();
	public static Item NScroll = new NScroll();
	public static Item Kurosawa = new Kurosawa().setUnlocalizedName("Kurosawa");
	public static Item Katana = new Katana().setUnlocalizedName("Katana");
	public static Item ChioRyuuGatana = new ChioRyuuGatana().setUnlocalizedName("ChioRyuuGatana");
	public static Item StoneSword = new StoneSword().setUnlocalizedName("StoneSword");
	public static Item Raitanto = new Raitanto().setUnlocalizedName("Raitanto");
	public static Item BushidoKatana = new BushidoKatana().setUnlocalizedName("BushidoKatana");
	public static Item SamuraiSword = new SamuraiSword().setUnlocalizedName("SamuraiSword");
	public static Item Wakizashi = new Wakizashi().setUnlocalizedName("Wakizashi");
	public static Item Kubikiribocho = new Kubikiribocho().setUnlocalizedName("Kubikiribocho");
	public static Item Tanto = new Tanto().setUnlocalizedName("Tanto");
	public static Item RyuuKatana = new RyuuKatana().setUnlocalizedName("RyuuKatana");
	public static Item TaishouSword = new TaishouSword().setUnlocalizedName("TaishouSword");
	public static Item SmokeBomb = new SmokeBomb().setUnlocalizedName("SmokeBomb");
	public static Item LightBomb = new LightBomb().setUnlocalizedName("LightBomb");
	public static Item Rin = new Rin().setUnlocalizedName("Rin");
	public static Item BigKunai = new BigKunai().setUnlocalizedName("BigKunai");
	public static Item Scalpel = new Scalpel().setUnlocalizedName("Scalpel");
	public static Item Kama = new Kama().setUnlocalizedName("Kama");
	public static Item KusariFuuboo = new KusariFuuboo().setUnlocalizedName("KusariFuuboo");
    public static Item Kusarigama = new Kusarigama().setUnlocalizedName("Kusarigama");
    public static Item Nunchaku =  new Nunchaku().setUnlocalizedName("Nunchaku");
    public static Item DoubleKusarigama = new DoubleKusarigama().setUnlocalizedName("DoubleKurasigama");
    public static Item ShellRockMace = new ShellRockMace().setUnlocalizedName("ShellRockMace");
    public static Item Kusarigamawithpiston = new Kusarigamawithpiston().setUnlocalizedName("Kusarigamawithpiston");
    public static Item Kunai = new Kunai().setUnlocalizedName("Kunai");
    public static Item Shuriken = new Shuriken().setUnlocalizedName("Shuriken");
    public static Item Senbon = new Senbon().setUnlocalizedName("Senbon");
    public static Item ExplodeKunai = new ExplodeKunai().setUnlocalizedName("ExplodeKunai");
    public static Item PoisonedSenbon = new PoisonedSenbon().setUnlocalizedName("PoisonedSenbon");
    public static Item BigShuriken = new BigShuriken().setUnlocalizedName("BigShuriken");
    public static Item DoubleKunai = new DoubleKunai().setUnlocalizedName("DoubleKunai");
    public static Item KumoShuriken = new KumoShuriken().setUnlocalizedName("KumoShuriken");
    public static Item FuumaShuriken = new FuumaShuriken().setUnlocalizedName("FuumaShuriken");
    public static Item Mine = new Mine().setUnlocalizedName("Mine");
    public static Item Weights = new Weights().setUnlocalizedName("Weights");
    public static Item WarKunai = new WarKunai().setUnlocalizedName("WarKunai");
    
	public static ArmorMaterial Bushido = Materials.armorBUSHIDO;
	public static ArmorMaterial Anbu = Materials.armorANBU;
	public static ArmorMaterial Kiri = Materials.armorKIRI;
	public static ArmorMaterial Suna = Materials.armorSUNA;
	public static ArmorMaterial Akatsuki = Materials.armorAKATSUKI;
	public static ArmorMaterial Iwa = Materials.armorIWA;
	public static ArmorMaterial Konoha = Materials.armorKONOHA;
	public static ArmorMaterial Oto = Materials.armorOTO;
	public static ArmorMaterial Old = Materials.armorOLD;
	public static ArmorMaterial Kumo = Materials.armorKUMO;
	public static ArmorMaterial Ryuu = Materials.armorRYUU;

	// public static int renderBushidoArmor = proxy.addArmor("Bushido");
	// public static Item = new (id+);

	protected static void registerItem(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}

	protected static void registerRendererToItem(Item item, String name) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
				.register(item, 0, new ModelResourceLocation(References.ModTexturePath + name, "inventory"));
	}

	public static void regItemsList() {
		// registerItem(, "");
		registerItem(FScroll, "FScroll");
		registerItem(KScroll, "KScroll");
		registerItem(DScroll, "DScroll");
		registerItem(SScroll, "SScroll");
		registerItem(RScroll, "RScroll");
		registerItem(HScroll, "HScroll");
		registerItem(EScroll, "EScroll");
		registerItem(NScroll, "NScroll");
		registerItem(Kurosawa, "Kurosawa");
	    registerItem(Katana, "Katana");
		registerItem(ChioRyuuGatana, "ChioRyuuGatana");
	    registerItem(StoneSword, "StoneSword");
	    registerItem(Raitanto, "Raitanto");
	    registerItem(BushidoKatana, "BushidoKatana");
	    registerItem(SamuraiSword, "SamuraiSword");
	    registerItem(Wakizashi, "Wakizashi");
	    registerItem(Kubikiribocho, "Kubikiribocho");
	    registerItem(Tanto, "Tanto");
	    registerItem(RyuuKatana, "RyuuKatana");
	    registerItem(TaishouSword, "TaishouSword");
	    registerItem(SmokeBomb, "SmokeBomb");
	    registerItem(LightBomb, "LightBomb");
	    registerItem(Rin , "Rin");
	    registerItem(BigKunai, "BigKunai");
	    registerItem(Scalpel, "Scalpel");
	    registerItem(Kama, "Kama");
	    registerItem(KusariFuuboo, "KusariFuuboo");
	    registerItem(Kusarigama, "Kusarigama");
	    registerItem(Nunchaku, "Nunchaku");
	    registerItem(DoubleKusarigama, "DoubleKusarigama");
	    registerItem(ShellRockMace, "ShellRockMace");
	    registerItem(Kusarigamawithpiston, "Kusarigamawithpiston");
	    registerItem(Kunai , "Kunai");
	    registerItem(Shuriken, "Shuriken");
	    registerItem(Senbon, "Senbon");
	    registerItem(ExplodeKunai, "ExplodeKunai");
	    registerItem(PoisonedSenbon, "PoisonedSenbon");
	    registerItem(DoubleKunai, "DoubleKunai");
	    registerItem(KumoShuriken, "KumoShuriken");
	    registerItem(FuumaShuriken, "FuumaShuriken");
	    registerItem(BigShuriken, "BigShuriken");
	    registerItem(Mine, "Mine");
	    registerItem(WarKunai, "WarKunai");
	    registerItem(Weights, "Weights");
	    
		
		// registerItem(, "");
	}

	public static void regRenderers() {
		registerRendererToItem(KScroll, "KScroll");
		registerRendererToItem(RScroll, "RScroll");
		registerRendererToItem(DScroll, "DScroll");
		registerRendererToItem(FScroll, "FScroll");
		registerRendererToItem(SScroll, "SScroll");
		registerRendererToItem(HScroll, "HScroll");
		registerRendererToItem(EScroll, "EScroll");
		registerRendererToItem(NScroll, "NScroll");
		registerRendererToItem(Kurosawa, "Kurosawa");
        registerRendererToItem(Katana, "Katana");
        registerRendererToItem(ChioRyuuGatana, "ChioRyuuGatana");
        registerRendererToItem(StoneSword, "StoneSword");
        registerRendererToItem(Raitanto, "Raitanto");
        registerRendererToItem(BushidoKatana, "BushidoKatana");
        registerRendererToItem(SamuraiSword, "SamuraiSword");
        registerRendererToItem(Wakizashi, "Wakizashi");
        registerRendererToItem(Kubikiribocho, "Kubikiribocho");
        registerRendererToItem(Tanto, "Tanto");
        registerRendererToItem(RyuuKatana, "RyuuKatana");
        registerRendererToItem(TaishouSword , "TaishouSword");
        registerRendererToItem(SmokeBomb, "SmokeBomb");
        registerRendererToItem(LightBomb, "LightBomb");
        registerRendererToItem(Rin , "Rin");
        registerRendererToItem(BigKunai, "BigKunai");
        registerRendererToItem(Scalpel, "Scalpel");
        registerRendererToItem(Kama, "Kama");
        registerRendererToItem(KusariFuuboo, "KusariFuuboo");
        registerRendererToItem(Kusarigama, "Kusarigama");
        registerRendererToItem(Nunchaku, "Nunchaku");
        registerRendererToItem(DoubleKusarigama, "DoubleKusarigama");
        registerRendererToItem(ShellRockMace, "ShellRockMace");
        registerRendererToItem(Kusarigamawithpiston, "Kusarigamawithpiston");
        registerRendererToItem(Kunai, "Kunai");
        registerRendererToItem(Shuriken, "Shuriken");
        registerRendererToItem(ExplodeKunai, "ExplodeKunai");
        registerRendererToItem(Senbon, "Senbon");
        registerRendererToItem(BigShuriken, "BigShuriken");
        registerRendererToItem(FuumaShuriken, "FuumaShuriken");
        registerRendererToItem(KumoShuriken, "KumoShuriken");
        registerRendererToItem(DoubleKunai, "DoubleKunai");
        registerRendererToItem(PoisonedSenbon, "PoisonedSenbon");
        registerRendererToItem(Mine, "Mine");
        registerRendererToItem(Weights, "Weights");
        registerRendererToItem(WarKunai, "WarKunai");
		
		
		
	}
}
