package pachycephalosauria.chimewood;

public class Reference {

	public static final String MOD_ID = "chimewood";
	public static final String NAME = "Chimewood";
	public static final String VERSION = "0.1";

	public static final String CLIENT_PROXY_CLASS = "pachycephalosauria.chimewood.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS ="pachycephalosauria.chimewood.proxy.ServerProxy";

	public static enum ChimewoodItems {
		CHIMEPICK("chimewoodPick", "ChimePickaxe");
		
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
		CHIMEWOODLOG("chimewoodLog", "ChimewoodLog");

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
