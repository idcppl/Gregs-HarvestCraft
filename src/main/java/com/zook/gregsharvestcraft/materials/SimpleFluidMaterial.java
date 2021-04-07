package com.zook.gregsharvestcraft.materials;

import com.google.common.collect.ImmutableList;
import com.zook.gregsharvestcraft.GregsHarvestCraft;
import gregtech.api.GTValues;
import gregtech.api.unification.stack.MaterialStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import java.util.HashMap;
import java.util.Map;

public class SimpleFluidMaterial extends SimpleMaterial {
    public static Map<String, SimpleFluidMaterial> GHC_FLUIDS = new HashMap<>();
    public FluidTextures fluidTexture;
    public int temperature;
    public Fluid fluid;
    public final ImmutableList<MaterialStack> materialComponents;
    public String chemicalFormula;

    public SimpleFluidMaterial(String name, int color, FluidTextures texture) {
        this(name, color, 300, null, texture);
    }

    public SimpleFluidMaterial(String name, int color, int temperature, FluidTextures texture) {
        this(name, color, temperature, null, texture);
    }

    public SimpleFluidMaterial(String name, int color, ImmutableList<MaterialStack> materialComponents, FluidTextures texture) {
        this(name, color, 300, materialComponents, texture);
    }

    public SimpleFluidMaterial(String name, int color, int temperature, ImmutableList<MaterialStack> materialComponents, FluidTextures texture) {
        this.name = name;
        this.color = color;
        this.temperature = temperature;
        this.materialComponents = materialComponents;
        this.chemicalFormula = calculateChemicalFormula();
        this.fluidTexture = texture;
        GHC_FLUIDS.put(name, this);
    }

    public FluidStack getFluid(int amount) {
        return new FluidStack(fluid, amount);
    }

    private String calculateChemicalFormula() {
        if (materialComponents != null && !materialComponents.isEmpty()) {
            StringBuilder components = new StringBuilder();
            for (MaterialStack component : materialComponents)
                components.append(component.toString());
            return components.toString();
        }
        return "";
    }
    public enum FluidTextures {
        liquid(new ResourceLocation(GregsHarvestCraft.MODID, "blocks/fluids/fluid.liquid"), new ResourceLocation(GregsHarvestCraft.MODID, "blocks/fluids/fluid.liquid")),
        smooth(new ResourceLocation(GregsHarvestCraft.MODID, "blocks/fluids/fluid.smooth"), new ResourceLocation(GregsHarvestCraft.MODID, "blocks/fluids/fluid.smooth")),
        molten(new ResourceLocation(GTValues.MODID, "blocks/fluids/fluid.molten"), new ResourceLocation(GTValues.MODID, "blocks/fluids/fluid.molten")),
        lava(new ResourceLocation(GregsHarvestCraft.MODID, "blocks/fluids/fluid.lava"), new ResourceLocation(GregsHarvestCraft.MODID, "blocks/fluids/fluid.lava")),
        powder(new ResourceLocation(GregsHarvestCraft.MODID, "blocks/fluids/fluid.powder"), new ResourceLocation(GregsHarvestCraft.MODID, "blocks/fluids/fluid.powder"));
        public ResourceLocation flowing;
        public ResourceLocation still;

        FluidTextures(ResourceLocation still, ResourceLocation flowing) {
            this.still = still;
            this.flowing = flowing;
        }

        public ResourceLocation getStill() {
            return still;
        }

        public ResourceLocation getFlowing() {
            return flowing;
        }
    }
}
