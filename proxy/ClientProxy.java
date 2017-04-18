package pachycephalosauria.chimewood.proxy;

import pachycephalosauria.chimewood.init.ModBlocks;
import pachycephalosauria.chimewood.init.ModItems;

public class ClientProxy  implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}