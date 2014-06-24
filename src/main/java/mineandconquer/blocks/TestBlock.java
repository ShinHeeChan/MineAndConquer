package mineandconquer.blocks;


import mineandconquer.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;

public class TestBlock extends BlockRottenRich{

	public TestBlock()
	{
		this.setBlockName(Strings.TestBlockName);
		//unlocalizedName�� �ο���
		this.setCreativeTab(CreativeTabs.tabBlock);
		ModBlocks.register(this);
	}
}
