package pachycephalosauria.chimewood.items;

import java.util.HashSet;

import net.minecraft.block.Block;
import pachycephalosauria.chimewood.Reference;

public class ChimeSpade extends ChimeTool {
	public ChimeSpade(String toolClass, ToolMaterial materialIn, boolean pick, boolean axe, boolean spade, boolean sword) {
		super(toolClass, materialIn, new HashSet<Block>(), pick, axe, spade, sword);

		setUnlocalizedName(Reference.ChimewoodItems.CHIMESPADE.getUnlocalizedName());
		setRegistryName(Reference.ChimewoodItems.CHIMESPADE.getRegistryName());
	}
}