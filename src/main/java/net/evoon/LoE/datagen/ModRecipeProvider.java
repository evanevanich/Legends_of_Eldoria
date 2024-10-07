package net.evoon.LoE.datagen;

import net.evoon.LoE.LoE;
import net.evoon.LoE.block.ModBlocks;
import net.evoon.LoE.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.UNCUT_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get(),ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.UNCUT_SAPPHIRE.get(), 0.25f, 200,"uncut_sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.UNCUT_SAPPHIRE.get(), 0.25f, 100,"uncut_sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.UNCUT_SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S',ModItems.UNCUT_SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.UNCUT_SAPPHIRE.get()), has(ModItems.UNCUT_SAPPHIRE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.UNCUT_SAPPHIRE.get(), 9)
                .requires(ModBlocks.UNCUT_SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.UNCUT_SAPPHIRE_BLOCK.get()), has(ModBlocks.UNCUT_SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ELDER_WOOD_PLANKS.get(), 4)
                .requires(ModBlocks.ELDER_WOOD_LOG.get())
                .unlockedBy(getHasName(ModBlocks.ELDER_WOOD_LOG.get()), has(ModBlocks.ELDER_WOOD_LOG.get()))
                .unlockedBy(getHasName(ModBlocks.ELDER_WOOD_PLANKS.get()), has(ModBlocks.ELDER_WOOD_PLANKS.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, LoE.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
