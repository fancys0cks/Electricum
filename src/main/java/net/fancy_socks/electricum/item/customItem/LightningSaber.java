package net.fancy_socks.electricum.item.customItem;

import net.fancy_socks.electricum.Electricum;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class LightningSaber extends SwordItem {
    public LightningSaber(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = target.getWorld();

        if (!world.isClient) {
            Electricum.LOGGER.info("hello");
            LightningEntity l = EntityType.LIGHTNING_BOLT.create(world);
            l.setPosition(target.getPos());
            world.spawnEntity(l);
        }


        return true;
    }
}
