package airswift.mod.objects.armor;

import airswift.mod.MAIN;
import airswift.mod.init.ItemInit;
import airswift.mod.util.IHasModel;
import net.minecraft.item.ItemArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ArmourBase extends ItemArmor implements IHasModel
{
	
	public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);

	ItemInit.ITEMS.add(this);
	}
	
	@Override 
	public void registerModels()
	{
		MAIN.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
