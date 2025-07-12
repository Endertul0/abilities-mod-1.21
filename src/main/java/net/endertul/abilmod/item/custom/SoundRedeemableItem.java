package net.endertul.abilmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class SoundRedeemableItem extends Item {
    public SoundRedeemableItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        World world = user.getWorld();
        world.playSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENTITY_PLAYER_LEVELUP,
                SoundCategory.PLAYERS, 100F, 0.25F, false);
        return super.useOnEntity(stack, user, entity, hand);
    }
}
