package pachycephalosauria.chimewood.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pachycephalosauria.chimewood.Reference;

public class ChimewoodLog extends Block {
	
	public ChimewoodLog() {
		super(Material.WOOD, MapColor.PURPLE);
		setUnlocalizedName(Reference.ChimewoodBlocks.CHIMEWOODLOG.getUnlocalizedName());
		setRegistryName(Reference.ChimewoodBlocks.CHIMEWOODLOG.getRegistryName());
		
		setHardness(1.0F);
		setSoundType(SoundType.WOOD);
		setResistance(1.0F);
		
		
	}

	@SideOnly(Side.CLIENT)
	    public void initModel() {
	        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));

	}
}