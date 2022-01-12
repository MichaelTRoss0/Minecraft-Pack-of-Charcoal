package dev.michaeltross.packofcharcoal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.michaeltross.packofcharcoal.items.PackOfCharcoalItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PackOfCharcoal.MOD_ID)
public class PackOfCharcoal {
    public static final String MOD_ID = "packofcharcoal";
    public static final Logger LOGGER = LogManager.getLogger("Pack of Charcoal");
    
    public static PackOfCharcoal instance;
    
    public PackOfCharcoal() {
        PackOfCharcoalItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    
}
