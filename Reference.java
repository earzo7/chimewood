package pachycephalosauria.chimewood;

import net.minecraft.item.Item;
import pachycephalosauria.chimewood.items.ChimeTool;

public class Reference {

	public static final String MOD_ID = "chimewood";
	public static final String NAME = "Chimewood";
	public static final String VERSION = "0.1";

	public static final String CLIENT_PROXY_CLASS = "pachycephalosauria.chimewood.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS ="pachycephalosauria.chimewood.proxy.ServerProxy";
	
    boolean canEnchantItem(Item itemIn){
    	return itemIn instanceof ChimeTool;
    }
	
	public static enum ChimewoodItems {
		//         unlocalized       registry
		CHIMEPICK("chimewoodpick", "ChimePickaxe"),
		CHIMEAXE("chimewoodaxe", "ChimeAxe"),
		CHIMESPADE("chimewoodspade", "ChimeSpade"),
		CHIMESWORD("chimewoodsword", "ChimeSword"),
		CHIMESTICK("chimewoodstick", "ChimeStick");
		
		private String unlocalizedName;
		private String registryName;

		ChimewoodItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getRegistryName() {
			return registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}

	public static enum ChimewoodBlocks {
		CHIMEWOODLOG("chimewoodlog", "ChimewoodLog");

		private String unlocalizedName;
		private String registryName;

		ChimewoodBlocks(String unlocalizedNameIn, String registryNameIn) {
			this.unlocalizedName = unlocalizedNameIn;
			this.registryName = registryNameIn;
		}

		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
