package dylangore.mod.blox.Client;

import net.minecraftforge.client.MinecraftForgeClient;
import dylangore.mod.blox.Common.CommonProxy;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
}
