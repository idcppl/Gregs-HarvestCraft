package com.zook.gregsharvestcraft.util;

import gregtech.api.items.metaitem.FoodUseManager;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.stats.IFoodBehavior;
import gregtech.api.items.metaitem.stats.IItemUseManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import squeek.appleskin.helpers.FoodHelper;

public class MetaItemFoodHelper extends FoodHelper {
    public static boolean isFood(ItemStack stackInHand) {
        if(stackInHand.getItem() instanceof MetaItem) {
            MetaItem<?> metaItem = (MetaItem<?>) stackInHand.getItem();
            MetaItem<?>.MetaValueItem metaValueItem = metaItem.getItem(stackInHand);
            IItemUseManager useManager = metaValueItem.getUseManager();
            if(useManager != null) {
                return useManager instanceof FoodUseManager;
            }
        }
        return false;
    }

    public static BasicFoodValues getDefaultFoodValues(ItemStack stackInHand) {
        MetaItem<?> metaItem = (MetaItem<?>) stackInHand.getItem();
        MetaItem<?>.MetaValueItem metaValueItem = metaItem.getItem(stackInHand);
        IItemUseManager useManager = metaValueItem.getUseManager();
        if(useManager != null) {
            if(useManager instanceof FoodUseManager) {
                FoodUseManager foodUseManager = (FoodUseManager) useManager;
                IFoodBehavior foodStats = foodUseManager.getFoodStats();
                int hunger = foodStats.getFoodLevel(stackInHand, null);
                float saturationModifier = foodStats.getSaturation(stackInHand, null);

                return new BasicFoodValues(hunger, saturationModifier);
            }
        }
        return new BasicFoodValues(0, 0f);
    }

    public static BasicFoodValues getModifiedFoodValues(ItemStack itemStack, EntityPlayer player) {
        return getDefaultFoodValues(itemStack);
    }
}
