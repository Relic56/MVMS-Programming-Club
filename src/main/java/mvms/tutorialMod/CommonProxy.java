package mvms.tutorialMod;

import mvms.tutorialMod.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/*
 * This is one of the myriad implementations of the CommonProxy design, and it is my preferred style.
 */
public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent e)
	{
		ModItems.createItems();//Create items in common because both client and server must know about them.
	}
	
	public void init(FMLInitializationEvent e)
	{
		//Currently Empty. Will fill up soon :)
	}
	
	public void postInit(FMLPostInitializationEvent e)
	{
		//Currently Empty. Will fill up soon :)
	}
}
