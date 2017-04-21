package pachycephalosauria.chimewood.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pachycephalosauria.chimewood.items.ChimeAxe;
import pachycephalosauria.chimewood.items.ChimePickaxe;
import pachycephalosauria.chimewood.items.ChimeSpade;
import pachycephalosauria.chimewood.items.ChimeStick;
import pachycephalosauria.chimewood.items.ChimeSword;

public class ModItems {
	
	public static ToolMaterial CHIMEWOOD = EnumHelper.addToolMaterial("Chimewood", 2, 1561, 6.0F, 2.0F, 100);
	
	public static ChimePickaxe chimewoodpick;
	public static ChimeAxe chimewoodaxe;
	public static ChimeSpade chimewoodspade;
	public static ChimeSword chimewoodsword;
	public static ChimeStick chimewoodstick;
	
	public static void init() {//                                    pick   axe    spade  sword
		chimewoodpick = new ChimePickaxe("chimewoodpick", CHIMEWOOD, true,  false, false, false);
		chimewoodaxe = new ChimeAxe("chimewoodaxe", CHIMEWOOD,       false, true,  false, false);
		chimewoodspade = new ChimeSpade("chimewoodspade", CHIMEWOOD, false, false, true,  false);
		chimewoodsword = new ChimeSword("chimewoodsword", CHIMEWOOD, false, false, false, true);
		chimewoodstick = new ChimeStick();
	}
	
	public static void register() {
		GameRegistry.register(chimewoodpick);
		GameRegistry.register(chimewoodaxe);
		GameRegistry.register(chimewoodspade);
		GameRegistry.register(chimewoodsword);
		GameRegistry.register(chimewoodstick);
	}
	
	public static void registerRenders(){
		registerRender(chimewoodpick);
		registerRender(chimewoodaxe);
		registerRender(chimewoodspade);
		registerRender(chimewoodsword);
		registerRender(chimewoodstick);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		//ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}