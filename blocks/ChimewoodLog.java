package pachycephalosauria.chimewood.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;
import pachycephalosauria.chimewood.Reference;

public class ChimewoodLog extends BlockContainer {
	
	public ChimewoodLog() {
		super(Material.WOOD, MapColor.PURPLE);
		setUnlocalizedName(Reference.ChimewoodBlocks.CHIMEWOODLOG.getUnlocalizedName());
		setRegistryName(Reference.ChimewoodBlocks.CHIMEWOODLOG.getRegistryName());
		
		setHardness(1.0F);
		setSoundType(SoundType.WOOD);
		setResistance(1.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityChimewoodLog();
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
}