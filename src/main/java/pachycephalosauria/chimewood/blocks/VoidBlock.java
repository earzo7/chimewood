package pachycephalosauria.chimewood.blocks;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pachycephalosauria.chimewood.Reference;

public class VoidBlock extends BlockBasePressurePlate{
	
    public static final PropertyBool POWERED = PropertyBool.create("powered");
    protected static final AxisAlignedBB PRESSURE_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	
	public VoidBlock() {
		super(Material.PORTAL);
        this.setDefaultState(this.blockState.getBaseState().withProperty(POWERED, Boolean.valueOf(false)));
		setUnlocalizedName(Reference.ChimewoodBlocks.VOID.getUnlocalizedName());
		setRegistryName(Reference.ChimewoodBlocks.VOID.getRegistryName());
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return PRESSURE_AABB;
    }
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

	@Override
	protected void playClickOnSound(World worldIn, BlockPos color) {}

	@Override
	protected void playClickOffSound(World worldIn, BlockPos pos) {}

	@Override
	protected int getRedstoneStrength(IBlockState state) {
        return ((Boolean)state.getValue(POWERED)).booleanValue() ? 15 : 0;
	}
	
	@Override
    protected IBlockState setRedstoneStrength(IBlockState state, int strength)
    {
        return state.withProperty(POWERED, Boolean.valueOf(strength > 0));
    }
	
	@Override
	protected int computeRedstoneStrength(World worldIn, BlockPos pos)
    {
        AxisAlignedBB axisalignedbb = PRESSURE_AABB.offset(pos);
        List <? extends Entity > list;
        
        list = worldIn.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);

        if (!list.isEmpty())
        {
            for (Entity entity : list)
            {
                if (!entity.doesEntityNotTriggerPressurePlate())
                {
                    return 15;
                }
            }
        }
        return 0;
    }
	
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos){}
	
	/**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(POWERED, Boolean.valueOf(meta == 1));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((Boolean)state.getValue(POWERED)).booleanValue() ? 1 : 0;
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {POWERED});
    }
    
    private boolean canBePlacedOn(World worldIn, BlockPos pos)
    {
        return worldIn.getBlockState(pos) != null;
    }
}
