package mvms.tutorialMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemFirstItem extends Item
{
	public ItemFirstItem()//default no-args constructor.
	{
		super();									//call Item's constructor
		this.setUnlocalizedName("itemFirstItem");	//set the in game name
		this.setCreativeTab(CreativeTabs.tabMisc);	//which tab is it in		
	}
}
