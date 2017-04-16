package pachycephalosauria.chimewood.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pachycephalosauria.chimewood.Reference;
import pachycephalosauria.chimewood.items.ChimePickaxe;

public class ModItems {
	
	public static ToolMaterial CHIMEWOOD = EnumHelper.addToolMaterial("Chimewood", 2, 1561, 6.0F, 2.0F, 100);
	public static ChimePickaxe chimewoodPick;
	
	public static void init() {//                                    pick  axe    spade  sword
		chimewoodPick = new ChimePickaxe("chimewoodPick", CHIMEWOOD, true, false, false, false);
	}
	
	public static void register() {
		GameRegistry.register(chimewoodPick);
	}
	
	public static void registerRenders(){
		registerRender(chimewoodPick);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":"+ item.getUnlocalizedName().substring(5), "inventory"));
		//ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}