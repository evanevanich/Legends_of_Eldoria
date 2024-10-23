package net.evoon.LoE.datagen;

import net.evoon.LoE.LoE;
import net.evoon.LoE.block.ModBlocks;
import net.evoon.LoE.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LoE.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BRONZE_BLOCK.get(),
                        ModBlocks.ADAMANTITE_BLOCK.get(),
                        ModBlocks.DWARVEN_STEEL_BLOCK.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.RAW_ADAMANTITE_BLOCK.get(),
                        ModBlocks.RAW_ITHILANIUM_BLOCK.get(),
                        ModBlocks.RAW_PLATINUM_BLOCK.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),
                        ModBlocks.PLATINUM_BLOCK.get(),
                        ModBlocks.SILVER_BLOCK.get(),
                        ModBlocks.ADAMANTITE_ORE.get(),
                        ModBlocks.CITRINE_ORE.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.CORUNDUM_ORE.get(),
                        ModBlocks.GLOWSTONE_ORE.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.OPAL_ORE.get(),
                        ModBlocks.ITHILANIUM_ORE.get(),
                        ModBlocks.PERIDOT_ORE.get(),
                        ModBlocks.QUARTZ_ORE.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(),
                        ModBlocks.DEEPSLATE_CITRINE_ORE.get(),
                        ModBlocks.DEEPSLATE_CORUNDUM_ORE.get(),
                        ModBlocks.DEEPSLATE_ITHILANIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_OPAL_ORE.get(),
                        ModBlocks.DEEPSLATE_GLOWSTONE_ORE.get(),
                        ModBlocks.DEEPSLATE_PERIDOT_ORE.get(),
                        ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_QUARTZ_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get()

                );

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.ELDER_WOOD.get(),
                        ModBlocks.ELDER_WOOD_PLANKS.get(),
                        ModBlocks.ELDER_WOOD_LOG.get()

                );

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL);

        this.tag(BlockTags.MINEABLE_WITH_HOE);

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BRONZE_BLOCK.get(),
                        ModBlocks.ELDER_WOOD_PLANKS.get()

                );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ADAMANTITE_ORE.get()

                );

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.ADAMANTITE_BLOCK.get(),
                        ModBlocks.ELDER_WOOD.get(),
                        ModBlocks.ELDER_WOOD_LOG.get()


                );

        this.tag(ModTags.Blocks.NEEDS_DWARVEN_TOOL)
                .add(ModBlocks.ADAMANTITE_BLOCK.get(),
                        ModBlocks.ELDER_WOOD.get(),
                        ModBlocks.ELDER_WOOD_LOG.get()


                );
        this.tag(BlockTags.FENCES)
                .add(ModBlocks.ELDER_WOOD_FENCE.get()

                );

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.ELDER_WOOD_WALL.get()

                );

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ELDER_WOOD_FENCE_GATE.get()

                );

    }
}
