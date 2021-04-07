package com.zook.gregsharvestcraft.items;

import gregtech.api.items.metaitem.MetaItem;

import java.util.List;

public class GHCMetaItems {
    private static List<MetaItem<?>> ITEMS = MetaItem.getMetaItems();

    public static MetaItem<?>.MetaValueItem BOWL;
    public static MetaItem<?>.MetaValueItem TALL_GLASS;
    public static MetaItem<?>.MetaValueItem SODA_BOTTLE;
    public static MetaItem<?>.MetaValueItem POTION_BOTTLE;
    public static MetaItem<?>.MetaValueItem MASON_JAR;
    public static MetaItem<?>.MetaValueItem CONDIMENTS_BOWL;

    public static void init() {
        GHCMetaItem item = new GHCMetaItem();
        item.setRegistryName("ghc_meta_item");
    }
}
