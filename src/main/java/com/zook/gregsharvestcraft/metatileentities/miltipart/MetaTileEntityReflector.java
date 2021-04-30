package com.zook.gregsharvestcraft.metatileentities.miltipart;

import com.google.common.base.Preconditions;
import com.zook.gregsharvestcraft.metatileentities.miltipart.capability.ReflectorAbility;
import gregtech.api.capability.GregtechTileCapabilities;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.cover.CoverBehavior;
import gregtech.api.cover.CoverDefinition;
import gregtech.api.gui.ModularUI;
import gregtech.api.metatileentity.MTETrait;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.IMultiblockAbilityPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.common.metatileentities.electric.multiblockpart.MetaTileEntityMultiblockPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.items.CapabilityItemHandler;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetaTileEntityReflector extends MetaTileEntityMultiblockPart implements IMultiblockAbilityPart<ReflectorAbility> {
    public Field test = ObfuscationReflectionHelper.findField(MetaTileEntity.class, "mteTraits");


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

    public <T> List<T> getAbilities(MultiblockAbility<T> ability) {
        if(getController() != null) {
            return getController().getAbilities(ability);
        }
        return Collections.emptyList();
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing side) {
        if(getController() != null) {
            if (capability == GregtechTileCapabilities.CAPABILITY_COVERABLE) {
                return GregtechTileCapabilities.CAPABILITY_COVERABLE.cast(this);
            }
            if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY &&
                    getController().getFluidInventory().getTankProperties().length > 0) {
                return CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY.cast(getController().getFluidInventory());
            } else if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY &&
                    getController().getItemInventory().getSlots() > 0) {
                return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(getController().getItemInventory());
            }
            List<MTETrait> traits = new ArrayList<>();
            try {
                traits = (List<MTETrait>) test.get(getController());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            T capabilityResult = null;
            for (MTETrait mteTrait : traits) {
                capabilityResult = mteTrait.getCapability(capability);
                if (capabilityResult != null) {
                    break;
                }
            }
            if (side != null && capabilityResult instanceof IEnergyContainer) {
                IEnergyContainer energyContainer = (IEnergyContainer) capabilityResult;
                if (!energyContainer.inputsEnergy(side) && !energyContainer.outputsEnergy(side)) {
                    return null; //do not provide energy container if it can't input or output energy at all
                }
            }
            return capabilityResult;
        }
        return super.getCapability(capability, side);
    }

    @Override
    public boolean hasFrontFacing() {
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
