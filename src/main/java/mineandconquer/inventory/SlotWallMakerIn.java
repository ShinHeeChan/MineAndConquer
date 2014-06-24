package mineandconquer.inventory;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class SlotWallMakerIn extends Slot {

	public SlotWallMakerIn(IInventory par1iInventory, int par2, int par3, int par4) {
		super(par1iInventory, par2, par3, par4);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isItemValid(ItemStack par1ItemStack) {
		// TODO Auto-generated method stub
		
		// ��� �κ��丮���� �� ���� ���ۿ� �� �� ����. ���� ��� �� ���¿����� �ϳ��� ���� ���� �� �ִ�. �׷��� �� ���¿����� ������ ���ۿ� ���� ���ϸ� �ٸ� ���� �ְ��� �ϴ� ���� ������ �������� �����ؾ��Ѵ�.
		
		if (!(par1ItemStack.getItem() instanceof ItemBlock)) 
			return false;
		
    	Item temp = null;
    	for (int i = 0 ; i < 12 ; i++) {
    		if (inventory.getStackInSlot(i) == null) continue;
    		temp = inventory.getStackInSlot(i).getItem();
    		break;
    	}
    	return temp == par1ItemStack.getItem() || temp == null;
	}
}
