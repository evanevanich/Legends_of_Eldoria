package net.evoon.LoE.datagen;

import net.evoon.LoE.LoE;
import net.evoon.LoE.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LoE.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.DWARVEN_STEEL_BLOCK);
        blockWithItem(ModBlocks.RAW_ITHILANIUM_BLOCK);
        blockWithItem(ModBlocks.ITHILANIUM_BLOCK);
        blockWithItem(ModBlocks.ITHILANIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ITHILANIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_QUARTZ_ORE);
        blockWithItem(ModBlocks.QUARTZ_ORE);
        blockWithItem(ModBlocks.UNCUT_QUARTZ_BLOCK);
        blockWithItem(ModBlocks.REFINED_QUARTZ_BLOCK);
        blockWithItem(ModBlocks.ADAMANTITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
        blockWithItem(ModBlocks.RAW_ADAMANTITE_BLOCK);
        blockWithItem(ModBlocks.ADAMANTITE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_OPAL_ORE);
        blockWithItem(ModBlocks.OPAL_ORE);
        blockWithItem(ModBlocks.UNCUT_OPAL_BLOCK);
        blockWithItem(ModBlocks.REFINED_OPAL_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.UNCUT_SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.REFINED_SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_CITRINE_ORE);
        blockWithItem(ModBlocks.CITRINE_ORE);
        blockWithItem(ModBlocks.UNCUT_CITRINE_BLOCK);
        blockWithItem(ModBlocks.REFINED_CITRINE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_CORUNDUM_ORE);
        blockWithItem(ModBlocks.CORUNDUM_ORE);
        blockWithItem(ModBlocks.UNCUT_CORUNDUM_BLOCK);
        blockWithItem(ModBlocks.REFINED_CORUNDUM_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_GLOWSTONE_ORE);
        blockWithItem(ModBlocks.GLOWSTONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.UNCUT_RUBY_BLOCK);
        blockWithItem(ModBlocks.REFINED_RUBY_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_PERIDOT_ORE);
        blockWithItem(ModBlocks.PERIDOT_ORE);
        blockWithItem(ModBlocks.UNCUT_PERIDOT_BLOCK);
        blockWithItem(ModBlocks.REFINED_PERIDOT_BLOCK);
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.ELDER_WOOD_PLANKS);
        blockWithItem(ModBlocks.ELDER_WOOD);
        blockWithItem(ModBlocks.ELDER_WOOD_LOG);

        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock(((StairBlock) ModBlocks.ELDER_WOOD_STAIRS.get()), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.ELDER_WOOD_SLAB.get()), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.ELDER_WOOD_BUTTON.get()), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.ELDER_WOOD_PRESSURE_PLATE.get()), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.ELDER_WOOD_FENCE.get()), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.ELDER_WOOD_FENCE_GATE.get()), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.ELDER_WOOD_WALL.get()), blockTexture(ModBlocks.ELDER_WOOD_LOG.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.ELDER_WOOD_DOOR.get()), modLoc("block/elder_door_bottom"), modLoc("block/elder_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ELDER_WOOD_TRAPDOOR.get()), modLoc("block/elder_wood_trapdoor"), true, "cutout");

        
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
