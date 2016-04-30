package mvms.tutorialMod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/*
 * Again, this is by no means the only implementation of the items format. There are plenty out there but
 * I personally prefer this one :)
 */
public class ModItems
{
	public static Item itemFirstItem;
	
	public static void createItems()
	{
		/*
		 *	This is NEW. In 1.8.9, there were seperate registers
		 *	for every type of item.
		 *	Now, there's a generic type for all. Makes stuff easier
		 */
		GameRegistry.register(itemFirstItem = new ItemFirstItem());	
	}
}
