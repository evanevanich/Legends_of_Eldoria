package net.evoon.LoE.item;

import net.evoon.LoE.LoE;
import net.evoon.LoE.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier DWARVEN = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1800, 9, 3, 0,
                    ModTags.Blocks.NEEDS_DWARVEN_TOOL, () -> Ingredient.of(ModItems.DWARVEN_STEEL.get())),
            new ResourceLocation(LoE.MOD_ID, "dwarven_steel"), List.of(Tiers.IRON), List.of());

}
