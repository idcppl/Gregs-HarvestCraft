package com.zook.gregsharvestcraft.metatileentities.miltipart;

import com.zook.gregsharvestcraft.metatileentities.miltipart.capability.ReflectorAbility;
import gregtech.api.gui.ModularUI;
import gregtech.api.metatileentity.MTETrait;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.IMultiblockAbilityPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.common.metatileentities.electric.multiblockpart.MetaTileEntityMultiblockPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public class MetaTileEntityReflector extends MetaTileEntityMultiblockPart implements IMultiblockAbilityPart<ReflectorAbility> {

    public MetaTileEntityReflector(ResourceLocation metaTileEntityId, int tier) {
        super(metaTileEntityId, tier);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder metaTileEntityHolder) {
        return new MetaTileEntityReflector(metaTileEntityId, getTier());
    }

    @Override
    protected ModularUI createUI(EntityPlayer entityPlayer) {
        return null;
    }

    @Override
    public void update() {
    }

    @Override
    protected boolean shouldUpdate(MTETrait trait) {
        return false;
    }

    @Override
    protected boolean openGUIOnRightClick() {
        return getController() != null;
    }

    @Override
    public MetaTileEntityHolder getHolder() {
        if(getController() != null) {
            return getController().getHolder();
        }
        return super.getHolder();
    }

    @Override
    public MultiblockAbility<ReflectorAbility> getAbility() {
        return GHCMultiblockAbility.REFLECTOR;
    }

    @Override
    public void registerAbilities(List<ReflectorAbility> list) {

    }
}
