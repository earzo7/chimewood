package pachycephalosauria.chimewood.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pachycephalosauria.chimewood.blocks.ChimewoodLog;
import pachycephalosauria.chimewood.blocks.ChimewoodLeaves;
import pachycephalosauria.chimewood.blocks.ChimewoodSapling;
import pachycephalosauria.chimewood.blocks.ThunderstoneBricks;
import pachycephalosauria.chimewood.blocks.TileEntityChimewoodLog;
import pachycephalosauria.chimewood.blocks.VoidBlock;

public class ModBlocks {

	public static Block chimewoodlog;
	public static Block chimewoodsapling;
	public static Block chimewoodleaves;
	public static Block thunderstone;
	public static Block keytile;
	public static Block voidblock;

	public static void init() {
		chimewoodlog = new ChimewoodLeaves();
		chimewoodsapling = new ChimewoodSapling();
		chimewoodleaves = new ChimewoodLog();
		thunderstone = new ThunderstoneBricks(false);
		keytile = new ThunderstoneBricks(true);
		voidblock = new VoidBlock();
		
		GameRegistry.registerTileEntity(TileEntityChimewoodLog.class, "tilechimewood");
	}

	public static void register() {
		registerBlock(chimewoodlog);
		registerBlock(chimewoodsapling);
		registerBlock(chimewoodleaves);
		registerBlock(thunderstone);
		registerBlock(voidblock);
		registerBlock(keytile);
	}

	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}

	public static void registerRenders(){
		registerRender(chimewoodlog);
		registerRender(chimewoodsapling);
		registerRender(chimewoodleaves);
		registerRender(thunderstone);
		registerRender(voidblock);
		registerRender(keytile);
	}

	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}