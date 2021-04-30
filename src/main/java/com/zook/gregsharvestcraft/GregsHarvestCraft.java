package com.zook.gregsharvestcraft;

import com.zook.gregsharvestcraft.items.GHCMetaItems;
import com.zook.gregsharvestcraft.metatileentities.GHCMetaTileEntities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = GregsHarvestCraft.MODID, name = GregsHarvestCraft.NAME, version = GregsHarvestCraft.VERSION)
public class GregsHarvestCraft {
    public static final String MODID = "gregsharvestcraft";
    public static final String NAME = "Greg's HarvestCraft";
    public static final String VERSION = "0.0.1";

    public static Logger logger;

    @SidedProxy(modId = GregsHarvestCraft.MODID, clientSide = "com.zook.gregsharvestcraft.ClientProxy", serverSide = "com.zook.gregsharvestcraft.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GHCFluids.init();
        GHCMetaItems.init();
        GHCMetaTileEntities.init();
        DrinkableFluids.init();
        proxy.onPreLoad();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.onLoad();
    }

}
