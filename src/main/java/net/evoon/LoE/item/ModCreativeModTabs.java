package net.evoon.LoE.item;

import net.evoon.LoE.LoE;
import net.evoon.LoE.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LoE.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LOE_TAB = CREATIVE_MODE_TABS.register("legends_of_eldoria",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ITHILANIUM.get()))
                    .title(Component.translatable("creativetab.legends_of_eldoria"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DWARVEN_STEEL.get());
                        output.accept(ModItems.ITHILANIUM.get());
                        output.accept(ModItems.ITHILANIUM_INGOT.get());
                        output.accept(ModItems.UNCUT_QUARTZ.get());
                        output.accept(ModItems.QUARTZ_GEM.get());
                        output.accept(ModItems.ADAMANTITE.get());
                        output.accept(ModItems.ADAMANTITE_INGOT.get());
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.RAW_PLATINUM.get());
                        output.accept(ModItems.PLATINUM_INGOT.get());
                        output.accept(ModItems.UNCUT_OPAL.get());
                        output.accept(ModItems.OPAL_GEM.get());
                        output.accept(ModItems.UNCUT_SAPPHIRE.get());
                        output.accept(ModItems.SAPPHIRE_GEM.get());
                        output.accept(ModItems.UNCUT_CITRINE.get());
                        output.accept(ModItems.CITRINE_GEM.get());
                        output.accept(ModItems.UNCUT_CORUNDUM.get());
                        output.accept(ModItems.CORUNDUM_GEM.get());
                        output.accept(ModItems.UNCUT_RUBY.get());
                        output.accept(ModItems.RUBY_GEM.get());
                        output.accept(ModItems.UNCUT_PERIDOT.get());
                        output.accept(ModItems.PERIDOT_GEM.get());
                        output.accept(ModItems.BRONZE_INGOT.get());

                        output.accept(ModItems.PINE_CONE.get());

                        output.accept(ModItems.ORE_DIVINING_ROD.get());

                        output.accept(ModItems.RAT_SKEWER.get());
                        output.accept(ModItems.RAT_SKEWER_COOKED.get());

                        output.accept(ModBlocks.DWARVEN_STEEL_BLOCK.get());
                        output.accept(ModBlocks.ITHILANIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_ITHILANIUM_BLOCK.get());
                        output.accept(ModBlocks.ITHILANIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ITHILANIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_GLOWSTONE_ORE.get());
                        output.accept(ModBlocks.GLOWSTONE_ORE.get());
                        output.accept(ModBlocks.QUARTZ_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_QUARTZ_ORE.get());
                        output.accept(ModBlocks.UNCUT_QUARTZ_BLOCK.get());
                        output.accept(ModBlocks.REFINED_QUARTZ_BLOCK.get());
                        output.accept(ModBlocks.ADAMANTITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get());
                        output.accept(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
                        output.accept(ModBlocks.ADAMANTITE_BLOCK.get());
                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                        output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());
                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        output.accept(ModBlocks.SILVER_BLOCK.get());
                        output.accept(ModBlocks.PLATINUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.OPAL_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_OPAL_ORE.get());
                        output.accept(ModBlocks.UNCUT_OPAL_BLOCK.get());
                        output.accept(ModBlocks.REFINED_OPAL_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.UNCUT_SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.REFINED_SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.CITRINE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_CITRINE_ORE.get());
                        output.accept(ModBlocks.UNCUT_CITRINE_BLOCK.get());
                        output.accept(ModBlocks.REFINED_CITRINE_BLOCK.get());
                        output.accept(ModBlocks.CORUNDUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_CORUNDUM_ORE.get());
                        output.accept(ModBlocks.UNCUT_CORUNDUM_BLOCK.get());
                        output.accept(ModBlocks.REFINED_CORUNDUM_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        output.accept(ModBlocks.UNCUT_RUBY_BLOCK.get());
                        output.accept(ModBlocks.REFINED_RUBY_BLOCK.get());
                        output.accept(ModBlocks.PERIDOT_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_PERIDOT_ORE.get());
                        output.accept(ModBlocks.UNCUT_PERIDOT_BLOCK.get());
                        output.accept(ModBlocks.REFINED_PERIDOT_BLOCK.get());
                        output.accept(ModBlocks.BRONZE_BLOCK.get());

                        output.accept(ModBlocks.ELDER_WOOD_PLANKS.get());
                        output.accept(ModBlocks.ELDER_WOOD.get());
                        output.accept(ModBlocks.ELDER_WOOD_LOG.get());
                        output.accept(ModBlocks.ELDER_WOOD_SLAB.get());
                        output.accept(ModBlocks.ELDER_WOOD_DOOR.get());
                        output.accept(ModBlocks.ELDER_WOOD_TRAPDOOR.get());
                        output.accept(ModBlocks.ELDER_WOOD_STAIRS.get());
                        output.accept(ModBlocks.ELDER_WOOD_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.ELDER_WOOD_WALL.get());
                        output.accept(ModBlocks.ELDER_WOOD_FENCE.get());
                        output.accept(ModBlocks.ELDER_WOOD_FENCE_GATE.get());
                        output.accept(ModBlocks.ELDER_WOOD_BUTTON.get());

                        output.accept(ModBlocks.SOUND_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
