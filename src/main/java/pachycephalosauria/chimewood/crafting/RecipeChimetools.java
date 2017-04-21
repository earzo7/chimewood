package pachycephalosauria.chimewood.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pachycephalosauria.chimewood.init.ModBlocks;
import pachycephalosauria.chimewood.init.ModItems;

public class RecipeChimetools
{
    /**
     * Adds the tool recipes to the CraftingManager.
     */
    public static void addRecipes() {
    	String[][] recipePatterns = new String[][] {{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"X", "X", "#"}};
    	Object[] recipeItems = new Object[] {ModItems.chimewoodpick, ModItems.chimewoodspade, ModItems.chimewoodaxe, ModItems.chimewoodsword};
    	
        for (int j = 0; j < recipeItems.length; ++j)
        {
            Item item = (Item)recipeItems[j];
            GameRegistry.addRecipe(new ItemStack(item), new Object[] {recipePatterns[j], '#', ModItems.chimewoodstick, 'X', ModBlocks.chimewoodlog});
        }
        
        GameRegistry.addRecipe(new ItemStack(ModItems.chimewoodstick, 4), new Object[] {"#", "#", '#', ModBlocks.chimewoodlog});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.chimewoodsapling, 1), new Object[] {"#X", '#', Blocks.SAPLING, 'X', Items.EXPERIENCE_BOTTLE});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.thunderstone, 64), new Object[] {"#X", '#', Blocks.STONE, 'X', Items.EXPERIENCE_BOTTLE});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.voidblock, 4), new Object[] {"#X", '#', Items.END_CRYSTAL, 'X', Items.EXPERIENCE_BOTTLE});
    }
}