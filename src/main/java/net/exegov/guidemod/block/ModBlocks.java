package net.exegov.guidemod.block;

import net.exegov.guidemod.GuideMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block NIVONIUM_CRYSTAL_BLOCK = registerBlock("nivonium_crystal_block",
            new Block(AbstractBlock.Settings.create().strength(10f,300f).jumpVelocityMultiplier(3f).requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GuideMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GuideMod.MOD_ID, name),new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GuideMod.LOGGER.info("Registering Mod Blocks for"+GuideMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.add(NIVONIUM_CRYSTAL_BLOCK);
        });
    }
}
