package com.zook.gregsharvestcraft.items;

import com.zook.gregsharvestcraft.DrinkableFluids;
import gregtech.api.items.metaitem.FoodUseManager;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.items.metaitem.stats.IItemUseManager;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class FoodMetaItem extends StandardMetaItem {
    public FoodMetaItem(short metaItemOffset) {
        super(metaItemOffset);
    }

    private IItemUseManager getUseManager(ItemStack itemStack) {
        MetaItem<?>.MetaValueItem metaValueItem = getItem(itemStack);
        if (metaValueItem == null) {
            return null;
        }
        return metaValueItem.getUseManager();
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack itemStack = player.getHeldItem(hand);
        IItemUseManager useManager = getUseManager(itemStack);
        if(useManager != null && useManager.canStartUsing(itemStack, player)) {
            NBTTagCompound tagCompound = itemStack.getTagCompound();
            if(tagCompound != null && tagCompound.hasKey("Fluid")) {
                String fluidName = tagCompound.getCompoundTag("Fluid").getString("FluidName");
                if(DrinkableFluids.DRINKABLES.containsKey(fluidName)) {
                    useManager.onItemUseStart(itemStack, player);
                    player.setActiveHand(hand);
                    return ActionResult.newResult(EnumActionResult.SUCCESS, itemStack);
                }
            }
        }
        return ActionResult.newResult(EnumActionResult.PASS, itemStack);
    }

    @Nullable
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entity) {
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            IItemUseManager useManager = getUseManager(stack);
            if (useManager != null) {
                player.inventory.addItemStackToInventory(withEmptyTag(stack));
                return useManager.onItemUseFinish(stack, player);
            }
        }
        return stack;
    }

    private ItemStack withEmptyTag(ItemStack stack) {
        return new ItemStack(stack.getItem(), 1, stack.getItemDamage());
    }

    @Override
    protected int getColorForItemStack(ItemStack stack, int tintIndex) {
        return 0xFFFFFF;
    }
}
