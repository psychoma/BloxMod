package dylangore.mod.blox.Blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dylangore.mod.blox.BloxMod;
import dylangore.mod.blox.Common.CommonProxy;

public class blockColoredStone extends Block {
	public blockColoredStone (int id) {
		super(id, Material.rock);
		setBlockName("ColoredStone");
		setCreativeTab(BloxMod.bloxTab);
		
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		return 0 + metadata;
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	
	@SuppressWarnings("unchecked")
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, @SuppressWarnings("rawtypes") List subItems) {
		for (int ix = 0; ix < 16; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
	
}
