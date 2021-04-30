package com.zook.gregsharvestcraft.metatileentities;

import com.zook.gregsharvestcraft.metatileentities.miltipart.GHCMultiblockAbility;
import gregtech.api.capability.impl.FluidTankList;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.ModularUI;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.gui.widgets.SlotWidget;
import gregtech.api.gui.widgets.TankWidget;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.api.multiblock.BlockPattern;
import gregtech.api.multiblock.FactoryBlockPattern;
import gregtech.api.render.ICubeRenderer;
import gregtech.api.render.Textures;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;

public class MetaTileEntityRainTank extends MultiblockControllerBase {

    private static final MultiblockAbility<?>[] ALLOWED_ABILITIES = {
            MultiblockAbility.IMPORT_FLUIDS, MultiblockAbility.EXPORT_FLUIDS, GHCMultiblockAbility.REFLECTOR, MultiblockAbility.IMPORT_ITEMS, MultiblockAbility.EXPORT_ITEMS
    };

    public MetaTileEntityRainTank(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId);
    }

    @Override
    protected void updateFormedValid() {

    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXX", "XXX", "XXX")
                .aisle("XXX", "X#X", "XXX")
                .aisle("XXX", "XYX", "XXX")
                .where('X', abilityPartPredicate(ALLOWED_ABILITIES))
                .where('#', isAirPredicate())
                .where('Y', selfPredicate())
                .build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.COKE_BRICKS;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder metaTileEntityHolder) {
        return new MetaTileEntityRainTank(metaTileEntityId);
    }

    @Override
    protected IItemHandlerModifiable createImportItemHandler() {
        return new ItemStackHandler(1);
    }

    @Override
    protected IItemHandlerModifiable createExportItemHandler() {
        return new ItemStackHandler(1);
    }

    @Override
    protected FluidTankList createExportFluidHandler() {
        return new FluidTankList(false, new FluidTank(32000));
    }

    @Override
    protected ModularUI createUI(EntityPlayer entityPlayer) {
        return ModularUI.builder(GuiTextures.BACKGROUND, 176, 166)
                .widget(new SlotWidget(importItems, 0, 33, 30, true, true)
                        .setBackgroundTexture(GuiTextures.SLOT, GuiTextures.FURNACE_OVERLAY))
                .progressBar(() -> 0, 58, 30, 20, 15, GuiTextures.BRONZE_BLAST_FURNACE_PROGRESS_BAR, ProgressWidget.MoveType.HORIZONTAL)
                .widget(new SlotWidget(exportItems, 0, 85, 30, true, false)
                        .setBackgroundTexture(GuiTextures.SLOT, GuiTextures.FURNACE_OVERLAY))
                .widget(new TankWidget(exportFluids.getTankAt(0), 133, 13, 20, 58)
                        .setBackgroundTexture(GuiTextures.FLUID_TANK_BACKGROUND)
                        .setOverlayTexture(GuiTextures.FLUID_TANK_OVERLAY)
                        .setContainerClicking(true, false))
                .bindPlayerInventory(entityPlayer.inventory, GuiTextures.SLOT)
                .build(getHolder(), entityPlayer);
    }
}
