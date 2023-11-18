package draylar.identity.ability.impl;

import draylar.identity.ability.IdentityAbility;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class ChickenAbility extends IdentityAbility<ChickenEntity> {

    @Override
    public void onUse(PlayerEntity player, ChickenEntity identity, World world) {
        player.spawnAtLocation(Items.EGG);

        // Play SFX
        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.CHICKEN_EGG, SoundCategory.PLAYERS, 1.0F, 1.0F + (world.random.nextFloat() - world.random.nextFloat()) * 0.2F);
    }

    @Override
    public Item getIcon() {
        return Items.EGG;
    }
}
