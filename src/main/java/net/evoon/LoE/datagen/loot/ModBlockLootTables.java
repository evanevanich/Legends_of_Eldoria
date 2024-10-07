package net.evoon.LoE.datagen.loot;

import net.evoon.LoE.block.ModBlocks;
import net.evoon.LoE.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        // this.dropSelf(ModBlocks.SOUND_BLOCKS.get());

        this.dropSelf(ModBlocks.ADAMANTITE_BLOCK.get());
        this.dropSelf(ModBlocks.DWARVEN_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ITHILANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.ITHILANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.UNCUT_QUARTZ_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_QUARTZ_BLOCK.get());
        this.dropSelf(ModBlocks.ADAMANTITE_ORE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get());
        this.dropSelf(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
        this.dropSelf(ModBlocks.ADAMANTITE_BLOCK.get());
        this.dropSelf(ModBlocks.DEEPSLATE_TIN_ORE.get());
        this.dropSelf(ModBlocks.TIN_ORE.get());
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        this.dropSelf(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
        this.dropSelf(ModBlocks.PLATINUM_ORE.get());
        this.dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.DEEPSLATE_SILVER_ORE.get());
        this.dropSelf(ModBlocks.SILVER_ORE.get());
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.UNCUT_OPAL_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_OPAL_BLOCK.get());
        this.dropSelf(ModBlocks.UNCUT_SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.UNCUT_CITRINE_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_CITRINE_BLOCK.get());
        this.dropSelf(ModBlocks.UNCUT_CORUNDUM_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_CORUNDUM_BLOCK.get());
        this.dropSelf(ModBlocks.UNCUT_RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.UNCUT_PERIDOT_BLOCK.get());
        this.dropSelf(ModBlocks.REFINED_PERIDOT_BLOCK.get());
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS.get());
        this.dropSelf(ModBlocks.ELDER_WOOD.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_LOG.get());

        this.dropSelf(ModBlocks.ELDER_WOOD_STAIRS.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_BUTTON.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_FENCE.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_WALL.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_TRAPDOOR.get());


        this.add(ModBlocks.ELDER_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ELDER_WOOD_SLAB.get()));

        this.add(ModBlocks.ELDER_WOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.ELDER_WOOD_DOOR.get()));


        this.add(ModBlocks.ITHILANIUM_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.ITHILANIUM_ORE.get(), ModItems.ITHILANIUM.get()));
        this.add(ModBlocks.CITRINE_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.CITRINE_ORE.get(), ModItems.UNCUT_CITRINE.get()));
        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.UNCUT_RUBY.get()));
        this.add(ModBlocks.OPAL_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.OPAL_ORE.get(), ModItems.UNCUT_OPAL.get()));
        this.add(ModBlocks.CORUNDUM_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.CORUNDUM_ORE.get(), ModItems.UNCUT_CORUNDUM.get()));
        this.add(ModBlocks.PERIDOT_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.PERIDOT_ORE.get(), ModItems.UNCUT_PERIDOT.get()));
        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.UNCUT_SAPPHIRE.get()));
        this.add(ModBlocks.QUARTZ_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.QUARTZ_ORE.get(), ModItems.UNCUT_QUARTZ.get()));
        this.add(ModBlocks.GLOWSTONE_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.GLOWSTONE_ORE.get(), Items.GLOWSTONE_DUST));
        this.add(ModBlocks.DEEPSLATE_ITHILANIUM_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.DEEPSLATE_ITHILANIUM_ORE.get(), ModItems.ITHILANIUM.get()));
        this.add(ModBlocks.DEEPSLATE_CITRINE_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.DEEPSLATE_CITRINE_ORE.get(), ModItems.UNCUT_CITRINE.get()));
        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.UNCUT_RUBY.get()));
        this.add(ModBlocks.DEEPSLATE_OPAL_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.DEEPSLATE_OPAL_ORE.get(), ModItems.UNCUT_OPAL.get()));
        this.add(ModBlocks.DEEPSLATE_CORUNDUM_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.DEEPSLATE_CORUNDUM_ORE.get(), ModItems.UNCUT_CORUNDUM.get()));
        this.add(ModBlocks.DEEPSLATE_PERIDOT_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.DEEPSLATE_PERIDOT_ORE.get(), ModItems.UNCUT_PERIDOT.get()));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.UNCUT_SAPPHIRE.get()));
        this.add(ModBlocks.DEEPSLATE_QUARTZ_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.DEEPSLATE_QUARTZ_ORE.get(), ModItems.UNCUT_QUARTZ.get()));
        this.add(ModBlocks.DEEPSLATE_GLOWSTONE_ORE.get(),
                block -> createGemstoneOreDrops(ModBlocks.DEEPSLATE_GLOWSTONE_ORE.get(), Items.GLOWSTONE));


    }

    protected LootTable.Builder createGemstoneOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                (LootPoolEntryContainer.Builder)
                        this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

    }
}
