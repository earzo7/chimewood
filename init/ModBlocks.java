package pachycephalosauria.chimewood.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pachycephalosauria.chimewood.blocks.ChimewoodLog;
import pachycephalosauria.chimewood.blocks.TileEntityChimewoodLog;

public class ModBlocks {

	public static Block chimewoodlog;

	public static void init() {
		chimewoodlog = new ChimewoodLog();
		
		GameRegistry.registerTileEntity(TileEntityChimewoodLog.class, "tilechimewood");
	}

	public static void register() {
		registerBlock(chimewoodlog);
	}

	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}

	public static void registerRenders(){
		registerRender(chimewoodlog);
	}

	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}