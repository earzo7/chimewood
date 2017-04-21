package pachycephalosauria.chimewood.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pachycephalosauria.chimewood.Reference;

public class ChimewoodLeaves extends BlockContainer {
	
	public ChimewoodLeaves() {
		super(Material.LEAVES, MapColor.DIAMOND);
		setUnlocalizedName(Reference.ChimewoodBlocks.CHIMEWOODLEAVES.getUnlocalizedName());
		setRegistryName(Reference.ChimewoodBlocks.CHIMEWOODLEAVES.getRegistryName());
		
		setHardness(1.0F);
		setSoundType(SoundType.PLANT);
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
	
	public int quantityDropped(Random random)
    {
        return 0;
    }
	
	public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }

	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
		return BlockRenderLayer.CUTOUT_MIPPED;
    }
	
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        return true;
    }
    
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
}