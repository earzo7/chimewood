package pachycephalosauria.chimewood;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import pachycephalosauria.chimewood.blocks.ChimewoodLeaves;
import pachycephalosauria.chimewood.init.ModBlocks;

public class WorldGenChimewoodTree extends WorldGenAbstractTree {
	
	public WorldGenChimewoodTree(boolean notify) {
		super(notify);
		// TODO Auto-generated constructor stub
	}

	private static final IBlockState LOG = ModBlocks.chimewoodlog.getDefaultState();
    private static final IBlockState LEAF = ModBlocks.chimewoodleaves.getDefaultState();
    
    //@Override
    public boolean generate(World world, Random r, BlockPos pos) {
    	int treeHeight = r.nextInt(2) + 5;
    	
    	buildTree(world, pos, treeHeight, LEAF);
    	buildLeaves(world, pos, treeHeight, LOG);
    	return true;
    }
    
    public boolean legalBlockLoc(World world, BlockPos pos){
    	IBlockState state = world.getBlockState(pos);
    	return !(state.getBlock() instanceof BlockAir || state.getBlock() instanceof BlockLeaves || state.getBlock() instanceof BlockSapling);
    }
    // && legalBlockLoc(world, pos.up(i))
    public void buildTree(World world, BlockPos pos, int height, IBlockState state) {
    	for (int i = 0; i < height; i++){
    		world.setBlockState(pos.up(i), state);
    	}
    }
    
    public void buildLeaves(World world, BlockPos pos, int height, IBlockState leaf){
    	//top
		world.setBlockState(pos.add(0, height, 0), leaf);
		world.setBlockState(pos.add(1, height, 0), leaf);
		world.setBlockState(pos.add(-1, height, 0), leaf);
		world.setBlockState(pos.add(0, height, -1), leaf);
		world.setBlockState(pos.add(0, height, 1), leaf);
		//second layer
		world.setBlockState(pos.add(1, height - 1, 0), leaf);
		world.setBlockState(pos.add(-1, height - 1, 0), leaf);
		world.setBlockState(pos.add(0, height - 1, -1), leaf);
		world.setBlockState(pos.add(0, height - 1, 1), leaf);
		world.setBlockState(pos.add(1, height - 1, 1), leaf);
		world.setBlockState(pos.add(-1, height - 1, 1), leaf);
		world.setBlockState(pos.add(-1, height - 1, -1), leaf);
		world.setBlockState(pos.add(1, height - 1, -1), leaf);
		//third layer
		world.setBlockState(pos.add(1, height - 2, 0), leaf);
		world.setBlockState(pos.add(-1, height - 2, 0), leaf);
		world.setBlockState(pos.add(0, height - 2, -1), leaf);
		world.setBlockState(pos.add(0, height - 2, 1), leaf);
		world.setBlockState(pos.add(1, height - 2, 1), leaf);
		world.setBlockState(pos.add(-1, height - 2, 1), leaf);
		world.setBlockState(pos.add(-1, height - 2, -1), leaf);
		world.setBlockState(pos.add(1, height - 2, -1), leaf);
		//fourth layer
		world.setBlockState(pos.add(1, height - 3, 0), leaf);
		world.setBlockState(pos.add(-1, height - 3, 0), leaf);
		world.setBlockState(pos.add(0, height - 3, -1), leaf);
		world.setBlockState(pos.add(0, height - 3, 1), leaf);
		world.setBlockState(pos.add(1, height - 3, 1), leaf);
		world.setBlockState(pos.add(-1, height - 3, 1), leaf);
		world.setBlockState(pos.add(-1, height - 3, -1), leaf);
		world.setBlockState(pos.add(1, height - 3, -1), leaf);
    }
}