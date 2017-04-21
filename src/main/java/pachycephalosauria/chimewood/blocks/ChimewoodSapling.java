package pachycephalosauria.chimewood.blocks;

import java.util.Random;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import pachycephalosauria.chimewood.Reference;
import pachycephalosauria.chimewood.WorldGenChimewoodTree;

public class ChimewoodSapling extends BlockBush implements IGrowable{

	public ChimewoodSapling() {
		super();
		setUnlocalizedName(Reference.ChimewoodBlocks.CHIMEWOODSAPLING.getUnlocalizedName());
		setRegistryName(Reference.ChimewoodBlocks.CHIMEWOODSAPLING.getRegistryName());
		setSoundType(SoundType.PLANT);
	}
	
	@Override
	public void grow(World worldIn, Random r, BlockPos pos, IBlockState state){
		WorldGenChimewoodTree gen = new WorldGenChimewoodTree(true);
		if (!gen.generate(worldIn, r, pos))
			worldIn.setBlockState(pos, getDefaultState());
	}

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
		return true;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return true;
	}

}