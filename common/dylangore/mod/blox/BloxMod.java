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
import dylangore.mod.blox.Blocks.blockColoredStone;
import dylangore.mod.blox.Blocks.blockColoredStone_Item;
import dylangore.mod.blox.CreativeTab.bloxTab;
import dylangore.mod.blox.Registry.GameRegistry.ColoredStone;

//Mod Info
@Mod(modid = "DGBlox", name = "DylanGore's Blox Mod", version = "2.0 Beta 1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class BloxMod {

	
	//Creative Tab
	public static CreativeTabs bloxTab = new bloxTab("BloxTab");
	
	//Colored Stone Block
	public static int blockColoredStoneId;
	public static Block blockColoredStone = new blockColoredStone(blockColoredStoneId).setHardness(1.5F).setResistance(10.0F);
	public static final String[] blockColoredStoneNames = { "White Stone",
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
			int blockColoredStoneId = config.getBlock("Colored Stone", 1000).getInt(1000);
		config.save();

		//Console Print
		System.out.println("Colored Blox Mod has been loaded");
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
		GameRegistry.registerBlock(blockColoredStone, blockColoredStone_Item.class,
				"Colored_Stone");
	}
}