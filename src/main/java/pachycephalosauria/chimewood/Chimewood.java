package pachycephalosauria.chimewood;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pachycephalosauria.chimewood.crafting.RecipeChimetools;
import pachycephalosauria.chimewood.init.ModBlocks;
import pachycephalosauria.chimewood.init.ModItems;
import pachycephalosauria.chimewood.modenchantments.ChimewoodEnchants;
import pachycephalosauria.chimewood.proxy.CommonProxy;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.11.2]")
public class Chimewood {
	
	@Instance
	public static Chimewood instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ChimewoodEnchants.registerEnchants();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		RecipeChimetools.addRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}