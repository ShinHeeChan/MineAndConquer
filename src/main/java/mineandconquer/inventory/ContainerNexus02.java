package mineandconquer.inventory;

import mineandconquer.MineAndConquer;
import mineandconquer.network.SimpleNetMessageClient;
import mineandconquer.tileentities.TENexus;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerNexus02 extends Container {

	TENexus tile;
	InventoryPlayer inventoryPlayer;
	final int shop_cow_value = 2;
	final int shop_sheep_value = 2;
	final int shop_pig_value = 2;
	final int shop_chicken_value = 2;
	final int shop_horse_value = 4;
	
	public ContainerNexus02(InventoryPlayer player, TENexus nexus) {
		this.tile = nexus;
		inventoryPlayer = player;
		bindPlayerInventory();
	}

	@Override
	public ItemStack slotClick(int slotIndex, int par2, int par3,
			EntityPlayer par4EntityPlayer) {
		// TODO Auto-generated method stub
		switch(slotIndex) {
		case 37 :
			if (tile.shop_diamondValue >= shop_cow_value && super.slotClick(slotIndex, par2, par3, par4EntityPlayer) != null) {
				tile.shop_diamondValue-=shop_cow_value;
			} else {
				return null;
			}
			break;
		case 38 :
			if (tile.shop_diamondValue >= shop_sheep_value && super.slotClick(slotIndex, par2, par3, par4EntityPlayer) != null) {
				tile.shop_diamondValue-=shop_sheep_value;
			} else {
				return null;
			}
			break;
		case 39 :
			if (tile.shop_diamondValue >= shop_pig_value&& super.slotClick(slotIndex, par2, par3, par4EntityPlayer) != null) {
				tile.shop_diamondValue-=shop_pig_value;
			} else {
				return null;
			}
			break;
		case 40 :
			if (tile.shop_diamondValue >= shop_chicken_value && super.slotClick(slotIndex, par2, par3, par4EntityPlayer) != null) {
				tile.shop_diamondValue-=shop_chicken_value;
			} else {
				return null;
			}
			break;
		case 41 :
			if (tile.shop_diamondValue >= shop_horse_value && super.slotClick(slotIndex, par2, par3, par4EntityPlayer) != null) {
				tile.shop_diamondValue-=shop_horse_value;
			} else {
				return null;
			}
			break;
		}
		return super.slotClick(slotIndex, par2, par3, par4EntityPlayer);
	}
	
	@Override
	public void addCraftingToCrafters(ICrafting par1iCrafting) {
		// TODO Auto-generated method stub
		super.addCraftingToCrafters(par1iCrafting);

		if (tile != null) {
			SimpleNetMessageClient msg = new SimpleNetMessageClient(2,
					tile.xCoord, tile.yCoord, tile.zCoord);
			msg.setInt(tile.shop_diamondValue);
			MineAndConquer.simpleChannel.sendToAll(msg);
		}

	}

	@Override
	public void detectAndSendChanges() {
		// TODO Auto-generated method stub
		super.detectAndSendChanges();
	}
	
	public void bindPlayerInventory() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(inventoryPlayer,
						j + i * 9 + 9, 26 + j * 18, 117 + i * 18));
			}
		}

		for (int i = 0; i < 9; ++i) {
			this.addSlotToContainer(new Slot(inventoryPlayer, i, 26 + i * 18,
					175));
		}

		addSlotToContainer(new SlotNexusDiamond(tile,
				TENexus.INVENTORY.shop_diamond_input.ordinal(), 26, 94));
		addSlotToContainer(new SlotNexusShop(tile,
				TENexus.INVENTORY.shop_cow_output.ordinal(), 80, -6));
		addSlotToContainer(new SlotNexusShop(tile,
				TENexus.INVENTORY.shop_sheep_output.ordinal(), 80, 14));
		addSlotToContainer(new SlotNexusShop(tile,
				TENexus.INVENTORY.shop_pig_output.ordinal(), 80, 34));
		addSlotToContainer(new SlotNexusShop(tile,
				TENexus.INVENTORY.shop_chicken_output.ordinal(), 80, 54));
		addSlotToContainer(new SlotNexusShop(tile,
				TENexus.INVENTORY.shop_horse_output.ordinal(), 80, 74));
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer,
			int slotIndex) {
		return null;
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		// TODO Auto-generated method stub
		return true;
	}

}
