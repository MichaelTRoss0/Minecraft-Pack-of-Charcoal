package dev.michaeltross.packofcharcoal.items;

import dev.michaeltross.packofcharcoal.PackOfCharcoal;
import dev.michaeltross.packofcharcoal.items.item.CharcoalPackItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PackOfCharcoalItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            PackOfCharcoal.MOD_ID);

    public static final RegistryObject<Item> CHARCOAL_PACK = ITEMS.register("charcoal_pack",
            () -> new CharcoalPackItem((new Item.Properties().tab(CreativeModeTab.TAB_MISC))));

}
