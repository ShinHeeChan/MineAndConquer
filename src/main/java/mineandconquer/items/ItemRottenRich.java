package mineandconquer.items;

import mineandconquer.lib.References;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRottenRich extends Item{
	
	public String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
		
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", References.RESOURCESPREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		//super.getUnlocalizedName()�� ��ȯ�ϴ� String�� tile.unlocalizedName ������ ������ �ִ�.
	}
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s", References.RESOURCESPREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		//super.getUnlocalizedName()�� ��ȯ�ϴ� String�� tile.unlocalizedName ������ ������ �ִ�.
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(References.RESOURCESPREFIX + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
}
