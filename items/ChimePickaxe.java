package pachycephalosauria.chimewood.items;

import java.util.HashSet;

import net.minecraft.block.Block;
import pachycephalosauria.chimewood.Reference;

public class ChimePickaxe extends ChimeTool {
	public ChimePickaxe(String toolClass, ToolMaterial materialIn, boolean pick, boolean axe, boolean spade, boolean sword) {
		super(toolClass, materialIn, new HashSet<Block>(), pick, axe, spade, sword);

		setUnlocalizedName(Reference.ChimewoodItems.CHIMEPICK.getUnlocalizedName());
		setRegistryName(Reference.ChimewoodItems.CHIMEPICK.getRegistryName());
	}
}