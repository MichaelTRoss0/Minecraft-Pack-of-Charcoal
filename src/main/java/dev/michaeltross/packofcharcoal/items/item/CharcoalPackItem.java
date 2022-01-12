package dev.michaeltross.packofcharcoal.items.item;

import javax.annotation.Nullable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class CharcoalPackItem extends Item {

    public CharcoalPackItem(Properties properties) {
        super(properties);
    }

    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 6400;
    }

}
