package com.zook.gregsharvestcraft;

import codechicken.lib.texture.TextureUtils;
import com.zook.gregsharvestcraft.util.MetaItemTooltipOverlay;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    public void onPreLoad() {
        super.onPreLoad();
        TextureUtils.addIconRegister(GHCFluids::registerSprites);
    }

    @Override
    public void onLoad() {
        MetaItemTooltipOverlay.init();
    }

    @Override
    public void onPostLoad() {

    }
}
