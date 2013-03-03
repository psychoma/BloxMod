package dylangore.mod.blox.ModBlocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dylangore.mod.blox.DGBlox;
import dylangore.mod.blox.common.CommonProxy;




public class DGStoneBlock extends Block {
	public static boolean BloxTabEnabled = true;
	public DGStoneBlock (int id) {
		super(id, Material.rock);
		setBlockName("ColoredStone");
		setCreativeTab(DGBlox.DGTab);
		
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
