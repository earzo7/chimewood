package pachycephalosauria.chimewood.modenchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import pachycephalosauria.chimewood.Reference;

public class EnchantmentAxe extends Enchantment {

	protected EnchantmentAxe(EntityEquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnumEnchantmentType.ALL, slots);

		setRegistryName(Reference.ChimewoodEnchants.CHOPPER.getRegistryName());
		this.setName("chopper");
	}
	
	@Override
	public boolean canApply(ItemStack stack)
    {
        return true;
    }
	
	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack)
    {
        return false;
    }
	
	@Override
	public boolean isAllowedOnBooks()
    {
        return false;
    }
	
	public int getMaxLevel()
    {
        return 1;
    }
}
