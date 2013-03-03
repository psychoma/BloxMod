package dylangore.mod.blox;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dylangore.mod.blox.Misc.DGTab;
import dylangore.mod.blox.ModBlocks.DGStoneBlock;
import dylangore.mod.blox.ModBlocks.DGStoneBlock_Item;
import dylangore.mod.blox.crafting.ColoredStone;

//Mod Info
@Mod(modid = "DGBlox", name = "DylanGore's Blox Mod", version = "1.3.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DGBlox {

	
	//Creative Tab
	public static CreativeTabs DGTab = new DGTab("BloxTab");
	
	//Colored Stone Block
	public static int DGStoneBlockId;
	public static Block DGStoneBlock = new DGStoneBlock(DGStoneBlockId).setHardness(1.5F).setResistance(10.0F);
	public static final String[] DGStoneBlockNames = { "White Stone",
		"Orange Stone", "Magenta Stone", "Light Blue Stone",
		"Yellow Stone", "Lime", "Pink Stone",
		"Dark Gray Stone", "Light Gray Stone", "Cyan Stone",
		"Purple Stone", "Blue Stone", "Brown Stone", "Green Stone",
		"Red Stone", "Black Stone" };
	
	@Mod.PreInit
	public void config(FMLPreInitializationEvent event) {
		// Config File
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
			int DGStoneBlockId = config.getBlock("Colored Stone", 1000).getInt(1000);
		config.save();

		//Console Print
		System.out.println("DylanGore's Colored Blox Mod has been loaded");
	}
	
	@Mod.Init
	public void load(FMLInitializationEvent event) {
	//Game Registry
		regBlocks();
		//Recipes
		ColoredStone.addColoredStoneRecipes();

	// Language Registry
		 languageRegistry();
	}

	private void languageRegistry() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.BloxTab",
				"en_US", "DG Colored Blox");
	}

	private void regBlocks() {
		//Colored Stone
		GameRegistry.registerBlock(DGStoneBlock, DGStoneBlock_Item.class,
				"DG_Stone");
	}
}