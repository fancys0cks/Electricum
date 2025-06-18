package net.fancy_socks.electricum.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fancy_socks.electricum.Electricum;
import net.fancy_socks.electricum.item.customItem.LightningSaber;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LITHIUM = registerItem("lithium", new Item(new Item.Settings()));
    public static final Item RAW_LITHIUM = registerItem("raw_lithium", new Item(new Item.Settings()));

    public static final Item LIGHTNING_SABER = registerItem("lightning_saber", new LightningSaber(ToolMaterials.NETHERITE,
            new Item.Settings().attributeModifiers(LightningSaber.createAttributeModifiers(ToolMaterials.NETHERITE, 23, 10f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Electricum.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Electricum.LOGGER.info("Registering Mod Items for " + Electricum.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LITHIUM);
            fabricItemGroupEntries.add(RAW_LITHIUM);

        });
    }
}
