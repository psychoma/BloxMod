package dylangore.mod.blox.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import dylangore.mod.blox.BloxMod;

public class bloxTab extends CreativeTabs 
{

	public bloxTab(String label) {
	    super(label);
	}
	@Override
	public ItemStack getIconItemStack() {
	    return new ItemStack(BloxMod.blockColoredStone);
	}

}