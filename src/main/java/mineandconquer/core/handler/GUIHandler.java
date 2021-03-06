package mineandconquer.core.handler;

import mineandconquer.client.gui.GUINexus01;
import mineandconquer.client.gui.GUINexus02;
import mineandconquer.client.gui.GUINexus03;
import mineandconquer.client.gui.GUINexus04;
import mineandconquer.client.gui.GUIWallMaker;
import mineandconquer.inventory.ContainerNexus01;
import mineandconquer.inventory.ContainerNexus02;
import mineandconquer.inventory.ContainerNexus03;
import mineandconquer.inventory.ContainerNexus04;
import mineandconquer.inventory.ContainerWallMaker;
import mineandconquer.lib.Strings;
import mineandconquer.tileentities.TENexus;
import mineandconquer.tileentities.TEWallMaker;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler {

	
	public GUIHandler() {}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		if(ID == Strings.GuiWallMakerID) {
			TEWallMaker teWallMaker = (TEWallMaker)world.getTileEntity(x, y, z);
			return new ContainerWallMaker(player.inventory, teWallMaker);
		}
		if(ID == Strings.GuiNexusID01) {
			TENexus teNexus = (TENexus)world.getTileEntity(x, y, z);
			return new ContainerNexus01(player.inventory, teNexus);
		}
		if(ID == Strings.GuiNexusID02) {
			TENexus teNexus = (TENexus)world.getTileEntity(x, y, z);
			return new ContainerNexus02(player.inventory, teNexus);
		}
		if(ID == Strings.GuiNexusID03) {
			TENexus teNexus = (TENexus)world.getTileEntity(x, y, z);
			return new ContainerNexus03(player.inventory, teNexus);
		}
		if(ID == Strings.GuiNexusID04) {
			TENexus teNexus = (TENexus)world.getTileEntity(x, y, z);
			return new ContainerNexus04(player.inventory, teNexus);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		
		if(ID == Strings.GuiWallMakerID) {
			TEWallMaker teWallMaker = (TEWallMaker)world.getTileEntity(x, y, z);
			return new GUIWallMaker(player.inventory, teWallMaker);
		}
		if(ID == Strings.GuiNexusID01) {
			TENexus teNexus = (TENexus)world.getTileEntity(x, y, z);
			return new GUINexus01(player.inventory, teNexus);
		}
		if(ID == Strings.GuiNexusID02) {
			TENexus teNexus = (TENexus)world.getTileEntity(x, y, z);
			return new GUINexus02(player.inventory, teNexus);
		}
		if(ID == Strings.GuiNexusID03) {
			TENexus teNexus = (TENexus)world.getTileEntity(x, y, z);
			return new GUINexus03(player.inventory, teNexus);
		}
		if(ID == Strings.GuiNexusID04) {
			TENexus teNexus = (TENexus)world.getTileEntity(x, y, z);
			return new GUINexus04(player.inventory, teNexus);
		}
		return null;
	}

}
