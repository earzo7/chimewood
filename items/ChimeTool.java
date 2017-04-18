package pachycephalosauria.chimewood.items;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ChimeTool extends ItemTool {
	
	boolean pickEnabled, axeEnabled, spadeEnabled, swordEnabled;
	int harvestLevel;
	float generalEfficiency, efficiencyOnProperMaterial;
	private static final Set<Block> PICK_EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE});
	private static final Set<Block> AXE_EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
	private static final Set<Block> SPADE_EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH});
	private static final Set<Block> SWORD_EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.WEB, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.VINE, Blocks.COCOA});
	
	protected ChimeTool(String unlocalizedName, ToolMaterial materialIn, Set<Block> effectiveBlocksIn, boolean pick, boolean axe, boolean spade, boolean sword) {
		super(materialIn, effectiveBlocksIn);
		generalEfficiency = 1.2F;
		efficiencyOnProperMaterial = 6.0F;
		harvestLevel = 2;
		
		pickEnabled = pick;
		axeEnabled = axe;
		spadeEnabled = spade;
		swordEnabled = sword;
		if (swordEnabled) {
			this.damageVsEntity = 5.0F;
			this.attackSpeed = -2.4F;
		} else {
			this.damageVsEntity = 2.0F;
			this.attackSpeed = -2.6F;
		}
	}
	
	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState blockState)
	{
		float out = generalEfficiency;

		if ((swordEnabled && SWORD_EFFECTIVE_ON.contains(blockState.getBlock())) || (pickEnabled && PICK_EFFECTIVE_ON.contains(blockState.getBlock())) || (axeEnabled && AXE_EFFECTIVE_ON.contains(blockState.getBlock())) || (spadeEnabled && SPADE_EFFECTIVE_ON.contains(blockState.getBlock())))
			out = efficiencyOnProperMaterial;
		
		return out;
	}

	public boolean canHarvestBlock(IBlockState blockIn)
    {
        Block block = blockIn.getBlock();
        boolean out = true;
        switch (block.getUnlocalizedName()) {
        	case "bedrock":
        		out = false;
        	case "diamond_block": case "diamond_ore":
        	case "emerald_block": case "emerald_ore":
        	case "gold_block": case "gold_ore":
        	case "redstone_block": case "redstone_ore":
        		out = this.toolMaterial.getHarvestLevel() >= 2;
        		break;
        	case "iron_block": case "iron_ore":
        	case "lapis_block": case "lapis_ore":
        		out = this.toolMaterial.getHarvestLevel() >= 1;
        		break;
        	case "obsidian":
        		out = this.toolMaterial.getHarvestLevel() >= 3;
        		break;
        	//default:
        		//Material material = blockIn.getMaterial();
        		//out = material == Material.ROCK ? true : (material == Material.IRON ? true : material == Material.ANVIL);
        		//break;
            }
        return out;
    }
}