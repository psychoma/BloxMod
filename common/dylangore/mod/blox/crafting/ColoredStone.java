package dylangore.mod.blox.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
public class ColoredStone {
	public static void registerBlockColoredStone(){
		
	}
	public static void addColoredStoneRecipes(){


		for (int ix = 0; ix < 16; ix++) {
			// Dyes (Change Ids)
			ItemStack DyeWhite = new ItemStack(Item.dyePowder, 1, 15);
			ItemStack DyeOrange = new ItemStack(Item.dyePowder, 1, 14);
			ItemStack DyeMagenta = new ItemStack(Item.dyePowder, 1, 13);
			ItemStack DyeLightBlue = new ItemStack(Item.dyePowder, 1, 12);
			ItemStack DyeYellow = new ItemStack(Item.dyePowder, 1, 11);
			ItemStack DyeLime = new ItemStack(Item.dyePowder, 1, 10);
			ItemStack DyePink = new ItemStack(Item.dyePowder, 1, 9);
			ItemStack DyeDarkGrey = new ItemStack(Item.dyePowder, 1, 8);
			ItemStack DyeLightGrey = new ItemStack(Item.dyePowder, 1, 7);
			ItemStack DyeCyan = new ItemStack(Item.dyePowder, 1, 6);
			ItemStack DyePurple = new ItemStack(Item.dyePowder, 1, 5);
			ItemStack DyeBlue = new ItemStack(Item.dyePowder, 1, 4);
			ItemStack DyeBrown = new ItemStack(Item.dyePowder, 1, 3);
			ItemStack DyeGreen = new ItemStack(Item.dyePowder, 1, 2);
			ItemStack DyeRed = new ItemStack(Item.dyePowder, 1, 1);
			ItemStack DyeBlack = new ItemStack(Item.dyePowder, 1);
			Block DGStoneBlock = dylangore.mod.blox.DGBlox.DGStoneBlock;
			// Colored Stone
			ItemStack DGStoneStack = new ItemStack(DGStoneBlock , 1, ix);
			// * White
			LanguageRegistry.addName(DGStoneStack,
					dylangore.mod.blox.DGBlox.DGStoneBlockNames[DGStoneStack.getItemDamage()]);
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 0),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,DyeWhite);
			// * Orange
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 1),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeOrange);
			// * Magenta
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 2),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeMagenta);
			// * LightBlue
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 3),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeLightBlue);
			// * Yellow
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 4),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeYellow);
			// * Lime
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 5),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeLime);
			// * Pink
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 6),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyePink);
			// * DarkGrey
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 7),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeDarkGrey);
			// * LightGrey
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 8),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeLightGrey);
			// * Cyan
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 9),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeCyan);
			// * Purple
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 10),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyePurple);
			// * Blue
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 11),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeBlue);
			// * Brown
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 12),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeBrown);
			// * Green
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 13),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeGreen);
			// * Red 
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 14),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeRed);
			// * Black 
			GameRegistry.addShapelessRecipe(new ItemStack(DGStoneBlock, 8, 15),
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone,Block.stone,
					Block.stone,Block.stone, DyeBlack);
		}
	}
}
