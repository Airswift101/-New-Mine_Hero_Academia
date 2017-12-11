package airswift.mod.objects.items;

import airswift.mod.MAIN;
import airswift.mod.init.ItemInit;
import airswift.mod.proxy.ClientProxy;
import airswift.mod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel 
{

	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);

	ItemInit.ITEMS.add(this);
	}
	
	@Override 
	public void registerModels()
	{
		MAIN.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
