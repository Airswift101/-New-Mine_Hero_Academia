package airswift.mod.init;

import java.awt.List;
import java.util.ArrayList;

import airswift.mod.objects.armor.ArmourBase;
import airswift.mod.objects.items.ItemBase;
import airswift.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
public static final ArrayList<Item> ITEMS = new ArrayList<Item>();

//material
public static final ArmorMaterial ARMOUR_UASPORTS = EnumHelper.addArmorMaterial("armour_uasports", Reference.MODID + ":uasports", 65, new int[] {3, 4, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

//items
public static final Item FABRIC_BLUE = new ItemBase("blue_fabric");

//armor
public static final Item UASPORTS_CHESTPLATE = new ArmourBase("chestplate_uasports",ARMOUR_UASPORTS, 1, EntityEquipmentSlot.CHEST);
public static final Item UASPORTS_LEGGINGS = new ArmourBase("leggings_uasports", ARMOUR_UASPORTS, 2, EntityEquipmentSlot.LEGS);

}
