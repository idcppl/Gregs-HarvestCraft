package com.zook.gregsharvestcraft.items;

import com.zook.gregsharvestcraft.DrinkableFluids;
import gregtech.api.capability.impl.SimpleThermalFluidHandlerItemStack;
import gregtech.api.items.metaitem.stats.IFoodBehavior;
import gregtech.api.items.metaitem.stats.IItemCapabilityProvider;
import gregtech.api.items.metaitem.stats.IItemComponent;
import gregtech.api.util.GTUtility;
import gregtech.api.util.RandomPotionEffect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.ICapabilityProvider;


import javax.annotation.Nullable;
import java.util.List;

public class FluidFoodStats implements IItemComponent, IItemCapabilityProvider, IFoodBehavior {
    public final int maxCapacity;
    public final int minFluidTemperature;
    public final int maxFluidTemperature;

    public FluidFoodStats(int maxCapacity, int minFluidTemperature, int maxFluidTemperature) {
        this.maxCapacity = maxCapacity;
        this.minFluidTemperature = minFluidTemperature;
        this.maxFluidTemperature = maxFluidTemperature;
    }

    @Override
    public int getFoodLevel(ItemStack itemStack, @Nullable EntityPlayer entityPlayer) {
        NBTTagCompound tagCompound = itemStack.getTagCompound();
        if(tagCompound != null && tagCompound.hasKey("Fluid")) {
            DrinkableFluids fluid = DrinkableFluids.DRINKABLES.get(tagCompound.getCompoundTag("Fluid").getString("FluidName"));
            if(fluid != null) {
                return fluid.foodLevel;
            }
        }
        return 0;
    }

    @Override
    public float getSaturation(ItemStack itemStack, @Nullable EntityPlayer entityPlayer) {
        NBTTagCompound tagCompound = itemStack.getTagCompound();
        if(tagCompound != null && tagCompound.hasKey("Fluid")) {
            DrinkableFluids fluid = DrinkableFluids.DRINKABLES.get(tagCompound.getCompoundTag("Fluid").getString("FluidName"));
            if(fluid != null) {
                return fluid.saturation;
            }
        }
        return 0;
    }

    @Override
    public boolean alwaysEdible(ItemStack itemStack, @Nullable EntityPlayer entityPlayer) {
        NBTTagCompound tagCompound = itemStack.getTagCompound();
        if(tagCompound != null && tagCompound.hasKey("Fluid")) {
            DrinkableFluids fluid = DrinkableFluids.DRINKABLES.get(tagCompound.getCompoundTag("Fluid").getString("FluidName"));
            if(fluid != null) {
                return fluid.alwaysEdible;
            }
        }
        return false;
    }

    @Override
    public EnumAction getFoodAction(ItemStack itemStack) {
        return EnumAction.DRINK;
    }

    @Override
    public void onEaten(ItemStack itemStack, EntityPlayer entityPlayer) {
        if (!entityPlayer.world.isRemote) {
            NBTTagCompound tagCompound = itemStack.getTagCompound();
            if(tagCompound != null && tagCompound.hasKey("Fluid")) {
                DrinkableFluids fluid = DrinkableFluids.DRINKABLES.get(tagCompound.getCompoundTag("Fluid").getString("FluidName"));
                if(fluid != null) {
                    for (RandomPotionEffect potionEffect : fluid.potionEffects) {
                        if (Math.random() * 100 > potionEffect.chance) {
                            entityPlayer.addPotionEffect(GTUtility.copyPotionEffect(potionEffect.effect));
                        }
                    }
                }
            }

        }
    }

    public float trueSaturation(ItemStack itemStack, @Nullable EntityPlayer entityPlayer) {
        return (getFoodLevel(itemStack, entityPlayer) * getSaturation(itemStack, entityPlayer) * 2);
    }

    @Override
    public void addInformation(ItemStack itemStack, List<String> tooltip) {
        tooltip.add("Food Level: " + getFoodLevel(itemStack, null));
        tooltip.add("Saturation: " + trueSaturation(itemStack, null));
    }

    @Override
    public ICapabilityProvider createProvider(ItemStack itemStack) {
        return new SimpleThermalFluidHandlerItemStack(itemStack, maxCapacity, minFluidTemperature, maxFluidTemperature);
    }
}
