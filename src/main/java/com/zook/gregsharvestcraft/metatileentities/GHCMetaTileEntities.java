package com.zook.gregsharvestcraft.metatileentities;

import com.zook.gregsharvestcraft.GregsHarvestCraft;
import com.zook.gregsharvestcraft.metatileentities.miltipart.MetaTileEntityReflector;
import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import net.minecraft.util.ResourceLocation;

public class GHCMetaTileEntities {
    public static MetaTileEntityRainTank RAIN_TANK;
    public static MetaTileEntityReflector[] REFLECTORS = new MetaTileEntityReflector[GTValues.V.length];

    public static void init() {
        RAIN_TANK = GregTechAPI.registerMetaTileEntity(7000, new MetaTileEntityRainTank(GHC("rain_tank")));

        for (int i = 0; i < GTValues.V.length; i++) {
            String voltageName = GTValues.VN[i].toLowerCase();
            REFLECTORS[i] = new MetaTileEntityReflector(GHC("reflector." + voltageName), i);

            GregTechAPI.registerMetaTileEntity(7000 + 10 + i, REFLECTORS[i]);
        }
    }

    private static ResourceLocation GHC(String name) {
        return new ResourceLocation(GregsHarvestCraft.MODID, name);
    }
}
