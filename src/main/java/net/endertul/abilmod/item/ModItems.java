package net.endertul.abilmod.item;

import net.endertul.abilmod.item.custom.SoundRedeemableItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.endertul.abilmod.AbilitiesMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SplashPotionItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DUPING = registerItem("ab_duping", new SoundRedeemableItem(new Item.Settings()));
    public static final Item FILLING = registerItem("ab_filling", new SoundRedeemableItem(new Item.Settings()));
    public static final Item ENCHANTING = registerItem("ab_enchanting", new SoundRedeemableItem(new Item.Settings()));
    public static final Item DAMAGING = registerItem("ab_damaging", new SoundRedeemableItem(new Item.Settings()));
    public static final Item GOD_EARS = registerItem("ab_god_ears", new SoundRedeemableItem(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AbilitiesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AbilitiesMod.LOGGER.info("Registering Mod Items for " + AbilitiesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DUPING);
            entries.add(FILLING);
            entries.add(ENCHANTING);
            entries.add(DAMAGING);
            entries.add(GOD_EARS);
        });
    }
}