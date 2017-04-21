package pachycephalosauria.chimewood.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import pachycephalosauria.chimewood.Reference;

public class ThunderstoneBricks extends Block {
	
	public ThunderstoneBricks(boolean keytile) {
		super(Material.ROCK, MapColor.PURPLE);
		if (!keytile) {
		setUnlocalizedName(Reference.ChimewoodBlocks.THUNDERSTONE.getUnlocalizedName());
		setRegistryName(Reference.ChimewoodBlocks.THUNDERSTONE.getRegistryName());
		} else {
			setUnlocalizedName(Reference.ChimewoodBlocks.KEYTILE.getUnlocalizedName());
			setRegistryName(Reference.ChimewoodBlocks.KEYTILE.getRegistryName());
		}
		setHardness(1.0F);
		setSoundType(SoundType.STONE);
		setResistance(1.0F);
	}
}