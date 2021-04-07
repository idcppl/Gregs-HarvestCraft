package com.zook.gregsharvestcraft.items;

import static com.zook.gregsharvestcraft.items.GHCMetaItems.*;

public class GHCMetaItem extends FoodMetaItem {
    public GHCMetaItem() {
        super((short) 0);
    }

    @Override
    public void registerSubItems() {
        BOWL = addItem(1, "bowl").addComponents(new FluidFoodStats(144, Integer.MIN_VALUE, Integer.MAX_VALUE));
        TALL_GLASS = addItem(2, "tall_glass").addComponents(new FluidFoodStats(144, Integer.MIN_VALUE, Integer.MAX_VALUE));
        SODA_BOTTLE = addItem(3, "soda_bottle").addComponents(new FluidFoodStats(144, Integer.MIN_VALUE, Integer.MAX_VALUE));
        POTION_BOTTLE = addItem(4, "potion_bottle").addComponents(new FluidFoodStats(144, Integer.MIN_VALUE, Integer.MAX_VALUE));
        MASON_JAR = addItem(5, "mason_jar").addComponents(new FluidFoodStats(144, Integer.MIN_VALUE, Integer.MAX_VALUE));
        CONDIMENTS_BOWL = addItem(6, "condiments_bowl").addComponents(new FluidFoodStats(144, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
