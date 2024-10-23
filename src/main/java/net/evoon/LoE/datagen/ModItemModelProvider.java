package net.evoon.LoE.datagen;

import net.evoon.LoE.LoE;
import net.evoon.LoE.block.ModBlocks;
import net.evoon.LoE.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LoE.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ITHILANIUM);
        simpleItem(ModItems.ITHILANIUM_INGOT);
        simpleItem(ModItems.UNCUT_QUARTZ);
        simpleItem(ModItems.QUARTZ_GEM);
        simpleItem(ModItems.DWARVEN_STEEL);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.ADAMANTITE);
        simpleItem(ModItems.ADAMANTITE_INGOT);
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.RAW_PLATINUM);
        simpleItem(ModItems.PLATINUM_INGOT);
        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.UNCUT_OPAL);
        simpleItem(ModItems.OPAL_GEM);
        simpleItem(ModItems.UNCUT_SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE_GEM);
        simpleItem(ModItems.UNCUT_CITRINE);
        simpleItem(ModItems.CITRINE_GEM);
        simpleItem(ModItems.UNCUT_CORUNDUM);
        simpleItem(ModItems.CORUNDUM_GEM);
        simpleItem(ModItems.UNCUT_RUBY);
        simpleItem(ModItems.RUBY_GEM);
        simpleItem(ModItems.UNCUT_PERIDOT);
        simpleItem(ModItems.PERIDOT_GEM);

        simpleItem(ModItems.PINE_CONE);

        simpleItem(ModItems.ORE_DIVINATION_RUNE);

        simpleItem(ModItems.RAT_SKEWER_COOKED);
        simpleItem(ModItems.RAT_SKEWER);

        simpleBlockItem(ModBlocks.ELDER_WOOD_DOOR);

        fenceItem(ModBlocks.ELDER_WOOD_FENCE, ModBlocks.ELDER_WOOD_PLANKS);
        buttonItem(ModBlocks.ELDER_WOOD_BUTTON, ModBlocks.ELDER_WOOD_PLANKS);
        wallItem(ModBlocks.ELDER_WOOD_WALL, ModBlocks.ELDER_WOOD);

        evenSimplerBlockItem(ModBlocks.ELDER_WOOD_STAIRS);
        evenSimplerBlockItem(ModBlocks.ELDER_WOOD_SLAB);
        evenSimplerBlockItem(ModBlocks.ELDER_WOOD_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.ELDER_WOOD_FENCE_GATE);

        trapdoorItem(ModBlocks.ELDER_WOOD_TRAPDOOR);

        handheldItem(ModItems.DWARVEN_SWORD);
        handheldItem(ModItems.DWARVEN_PICKAXE);
        handheldItem(ModItems.DWARVEN_AXE);
        handheldItem(ModItems.DWARVEN_SHOVEL);
        handheldItem(ModItems.DWARVEN_BATTLEAXE);
        handheldItem(ModItems.DWARVEN_DAGGER);
        handheldItem(ModItems.DWARVEN_HALBERD);
        handheldItem(ModItems.DWARVEN_HATCHET);
        handheldItem(ModItems.DWARVEN_KNIFE);
        handheldItem(ModItems.DWARVEN_PIKE);
        handheldItem(ModItems.DWARVEN_SPEAR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LoE.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(LoE.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(LoE.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(LoE.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(LoE.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));

    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(LoE.MOD_ID,"item/" + item.getId().getPath()));
    }


private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
    return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
            new ResourceLocation(LoE.MOD_ID,"item/" + item.getId().getPath()));
    }
}
