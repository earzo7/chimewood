package pachycephalosauria.chimewood.items;

import java.util.HashSet;

import net.minecraft.block.Block;
import pachycephalosauria.chimewood.Reference;

public class ChimeSword extends ChimeTool {
	public ChimeSword(String toolClass, ToolMaterial materialIn, boolean pick, boolean axe, boolean spade, boolean sword) {
		super(toolClass, materialIn, new HashSet<Block>(), pick, axe, spade, sword);

		setUnlocalizedName(Reference.ChimewoodItems.CHIMESWORD.getUnlocalizedName());
		setRegistryName(Reference.ChimewoodItems.CHIMESWORD.getRegistryName());
	}
}