package pachycephalosauria.chimewood.modenchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChimewoodEnchants {
	
	public static void registerEnchants() {
		EnchantmentAxe enchantmentaxe = new EnchantmentAxe(EntityEquipmentSlot.MAINHAND);
		GameRegistry.register(enchantmentaxe);
	}
}