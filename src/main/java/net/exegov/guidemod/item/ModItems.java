package net.exegov.guidemod.item;

import net.exegov.guidemod.GuideMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static Item NIVONIUM_CRYSTAL = registerItem("nivonium_crystal", new Item(new Item.Settings()));
    public static Item UNPOLISHED_NIVONIUM = registerItem("unpolished_nivonium", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GuideMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        GuideMod.LOGGER.info("Registering Mod Items for "+GuideMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(NIVONIUM_CRYSTAL);
            entries.add(UNPOLISHED_NIVONIUM);
        });
    }
}
