package com.zook.gregsharvestcraft;

import gregtech.api.unification.material.Materials;
import gregtech.api.util.RandomPotionEffect;
import net.minecraftforge.fluids.Fluid;

import java.util.HashMap;
import java.util.Map;

import static com.pam.harvestcraft.HarvestCraft.config;

public class DrinkableFluids {
    public static Map<String, DrinkableFluids> DRINKABLES = new HashMap<>();
    public final RandomPotionEffect[] potionEffects;
    public final boolean alwaysEdible;
    public final float saturation;
    public final int foodLevel;
    public final Fluid fluid;

    public DrinkableFluids(Fluid fluid, int foodLevel, float saturation, boolean alwaysEdible, RandomPotionEffect... potionEffects) {
        this.fluid = fluid;
        this.foodLevel = foodLevel;
        this.saturation = saturation;
        this.alwaysEdible = alwaysEdible;
        this.potionEffects = potionEffects;
        DRINKABLES.put(fluid.getName(), this);
    }

    public DrinkableFluids(Fluid fluid, int foodLevel, float saturation) {
        this(fluid, foodLevel, saturation, false);
    }

    public static void init() {
        new DrinkableFluids(GHCMaterials.AppleJelly.fluid, 2, 1.2F);
        new DrinkableFluids(GHCMaterials.GrapeJelly.fluid, 2, 1.2F);
    }
}
