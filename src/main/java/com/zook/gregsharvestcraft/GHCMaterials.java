package com.zook.gregsharvestcraft;

import com.zook.gregsharvestcraft.materials.SimpleFluidMaterial;
import gregtech.api.unification.material.IMaterialHandler;
import static com.zook.gregsharvestcraft.materials.SimpleFluidMaterial.FluidTextures.*;

@IMaterialHandler.RegisterMaterialHandler
public class GHCMaterials implements IMaterialHandler {
    //spices/ingredients
    public static final SimpleFluidMaterial BlackPepper = new SimpleFluidMaterial("black_pepper", 0x242424, powder);
    public static final SimpleFluidMaterial BrownSugar = new SimpleFluidMaterial("brown_sugar", 0x543716, powder);
    public static final SimpleFluidMaterial CocoaPowder = new SimpleFluidMaterial("cocoa_powder", 0xfcd62b, powder);
    public static final SimpleFluidMaterial Cornmeal = new SimpleFluidMaterial("cornmeal", 0xfcd62b, powder);
    public static final SimpleFluidMaterial CurryPowder = new SimpleFluidMaterial("curry_powder", 0xfcd62b, powder);
    public static final SimpleFluidMaterial Flour = new SimpleFluidMaterial("flour", 0xDEDEDE, powder);
    public static final SimpleFluidMaterial GroundCinnamon = new SimpleFluidMaterial("ground_cinnamon", 0x995203, powder);
    public static final SimpleFluidMaterial GroundNutmeg = new SimpleFluidMaterial("ground_nutmeg", 0xffaf57, powder);
    public static final SimpleFluidMaterial Salt = new SimpleFluidMaterial("salt", 0xE8E8E8, powder);
    public static final SimpleFluidMaterial WhiteSugar = new SimpleFluidMaterial("white_sugar", 0xFFFFFF, powder);

    //dairies
    public static final SimpleFluidMaterial BananaMilkshake = new SimpleFluidMaterial("banana_milkshake", 0xcbcb58, smooth);
    public static final SimpleFluidMaterial CaramelIceCream = new SimpleFluidMaterial("caramel_ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial CherryIceCream = new SimpleFluidMaterial("cherry_ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial ChocolateIceCream = new SimpleFluidMaterial("chocolate_ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial ChocolateMilk = new SimpleFluidMaterial("chocolate_milk", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial ChocolateMilkshake = new SimpleFluidMaterial("chocolate_milkshake", 0x90794f, smooth);
    public static final SimpleFluidMaterial CoconutMilk = new SimpleFluidMaterial("coconut_milk", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial DurianMilkshake = new SimpleFluidMaterial("durian_milkshake", 0xbad46b, smooth);
    public static final SimpleFluidMaterial GooseberryMilkshake = new SimpleFluidMaterial("gooseberry_milkshake", 0xe3d684, smooth);
    public static final SimpleFluidMaterial HeavyCream = new SimpleFluidMaterial("heavy_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial IceCream = new SimpleFluidMaterial("ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial MintChocolateChipIceCream = new SimpleFluidMaterial("mint_chocolate_chip_ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial MochaIceCream = new SimpleFluidMaterial("mocha_ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial NeapolitanIceCream = new SimpleFluidMaterial("neapolitan_ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial PistachioIceCream = new SimpleFluidMaterial("pistachio_ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial SoyMilk = new SimpleFluidMaterial("soy_milk", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial SpumoniIceCream = new SimpleFluidMaterial("spumoni_ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial StrawberryIceCream = new SimpleFluidMaterial("strawberry_ice_cream", 0xFFFEE8, molten);
    public static final SimpleFluidMaterial StrawberryMilkshake = new SimpleFluidMaterial("strawberry_milkshake", 0xd9afac, smooth);
    public static final SimpleFluidMaterial VanillaIceCream = new SimpleFluidMaterial("vanilla_ice_cream", 0xFFFEE8, molten);

    //idk
    public static final SimpleFluidMaterial Vinegar = new SimpleFluidMaterial("vinegar", 0xFFFFFF, liquid);

    //condiments
    public static final SimpleFluidMaterial Ketchup = new SimpleFluidMaterial("ketchup", 0xa62121, smooth);
    public static final SimpleFluidMaterial PeanutButter = new SimpleFluidMaterial("peanut_butter", 0xd4852c, smooth);
    public static final SimpleFluidMaterial MapleSyrup = new SimpleFluidMaterial("maple_syrup", 0xA37540, liquid);
    public static final SimpleFluidMaterial Mayo = new SimpleFluidMaterial("mayo", 0xfff8b8, smooth);

    //jellies
    public static final SimpleFluidMaterial AppleJelly = new SimpleFluidMaterial("apple_jelly", 0xC7b540, lava);
    public static final SimpleFluidMaterial ApricotJelly = new SimpleFluidMaterial("apricot_jelly", 0xe8af6b, lava);
    public static final SimpleFluidMaterial BlackberryJelly = new SimpleFluidMaterial("blackberry_jelly", 0x592a2a, lava);
    public static final SimpleFluidMaterial BlueberryJelly = new SimpleFluidMaterial("blueberry_jelly", 0x1d3459, lava);
    public static final SimpleFluidMaterial CherryJelly = new SimpleFluidMaterial("cherry_jelly", 0x911600, lava);
    public static final SimpleFluidMaterial CranberryJelly = new SimpleFluidMaterial("cranberry_jelly", 0xaa1d1d, lava);
    public static final SimpleFluidMaterial FigJelly = new SimpleFluidMaterial("fig_jelly", 0xbd8bd8, lava);
    public static final SimpleFluidMaterial GooseberryJelly = new SimpleFluidMaterial("gooseberry_jelly", 0xe5c646, lava);
    public static final SimpleFluidMaterial GrapeJelly = new SimpleFluidMaterial("grape_jelly", 0x9622a0, lava);
    public static final SimpleFluidMaterial GrapefruitJelly = new SimpleFluidMaterial("grapefruit_jelly", 0xd18533, lava);
    public static final SimpleFluidMaterial KiwiJelly = new SimpleFluidMaterial("kiwi_jelly", 0xabe05d, lava);
    public static final SimpleFluidMaterial LemonJelly = new SimpleFluidMaterial("lemon_jelly", 0xeeca00, lava);
    public static final SimpleFluidMaterial LimeJelly = new SimpleFluidMaterial("lime_jelly", 0x76d378, lava);
    public static final SimpleFluidMaterial MangoJelly = new SimpleFluidMaterial("mango_jelly", 0xda7b7b, lava);
    public static final SimpleFluidMaterial OrangeJelly = new SimpleFluidMaterial("orange_jelly", 0xf29a3b, lava);
    public static final SimpleFluidMaterial PapayaJelly = new SimpleFluidMaterial("papaya_jelly", 0xdbae72, lava);
    public static final SimpleFluidMaterial PeachJelly = new SimpleFluidMaterial("peach_jelly", 0xd29c78, lava);
    public static final SimpleFluidMaterial PearJelly = new SimpleFluidMaterial("pear_jelly", 0xadbf5a, lava);
    public static final SimpleFluidMaterial PepperJelly = new SimpleFluidMaterial("pepper_jelly", 0x5e8f40, lava);
    public static final SimpleFluidMaterial PersimmonJelly = new SimpleFluidMaterial("persimmon_jelly", 0xee9521, lava);
    public static final SimpleFluidMaterial PlumJelly = new SimpleFluidMaterial("plum_jelly", 0xc260ca, lava);
    public static final SimpleFluidMaterial PomegranateJelly = new SimpleFluidMaterial("pomegranate_jelly", 0xa03d3d, lava);
    public static final SimpleFluidMaterial RaspberryJelly = new SimpleFluidMaterial("raspberry_jelly", 0xa63749, lava);
    public static final SimpleFluidMaterial RoyalJelly = new SimpleFluidMaterial("royal_jelly", 0xd89f03, lava);
    public static final SimpleFluidMaterial StarfruitJelly = new SimpleFluidMaterial("starfruit_jelly", 0xc0ed6c, lava);
    public static final SimpleFluidMaterial StrawberryJelly = new SimpleFluidMaterial("strawberry_jelly", 0xc41a1a, lava);
    public static final SimpleFluidMaterial WatermelonJelly = new SimpleFluidMaterial("watermelon_jelly", 0xe35849, lava);

    //juices
    public static final SimpleFluidMaterial AppleJuice = new SimpleFluidMaterial("apple_juice", 0xC7b540, molten);
    public static final SimpleFluidMaterial ApricotJuice = new SimpleFluidMaterial("apricot_juice", 0xe8af6b, molten);
    public static final SimpleFluidMaterial BlackberryJuice = new SimpleFluidMaterial("blackberry_juice", 0x592a2a, molten);
    public static final SimpleFluidMaterial BlueberryJuice = new SimpleFluidMaterial("blueberry_juice", 0x1d3459, molten);
    public static final SimpleFluidMaterial CactusFruitJuice = new SimpleFluidMaterial("cactus_fruit_juice", 0xdf3434, molten);
    public static final SimpleFluidMaterial CarrotJuice = new SimpleFluidMaterial("carrot_juice", 0xf17200, molten);
    public static final SimpleFluidMaterial CherryJuice = new SimpleFluidMaterial("cherry_juice", 0x911600, molten);
    public static final SimpleFluidMaterial CranberryJuice = new SimpleFluidMaterial("cranberry_juice", 0xaa1d1d, molten);
    public static final SimpleFluidMaterial FigJuice = new SimpleFluidMaterial("fig_juice", 0xbd8bd8, molten);
    public static final SimpleFluidMaterial GrapeJuice = new SimpleFluidMaterial("grape_juice", 0x9622a0, molten);
    public static final SimpleFluidMaterial GrapefruitJuice = new SimpleFluidMaterial("grapefruit_juice", 0xd18533, molten);
    public static final SimpleFluidMaterial KiwiJuice = new SimpleFluidMaterial("kiwi_juice", 0xabe05d, molten);
    public static final SimpleFluidMaterial Lemonade = new SimpleFluidMaterial("lemonade", 0xe5c646, molten);
    public static final SimpleFluidMaterial LimeJuice = new SimpleFluidMaterial("lime_juice", 0x76d378, molten);
    public static final SimpleFluidMaterial MangoJuice = new SimpleFluidMaterial("mango_juice", 0xda7b7b, molten);
    public static final SimpleFluidMaterial MelonJuice = new SimpleFluidMaterial("melon_juice", 0xe35849, molten);
    public static final SimpleFluidMaterial OrangeJuice = new SimpleFluidMaterial("orange_juice", 0xf29a3b, molten);
    public static final SimpleFluidMaterial PapayaJuice = new SimpleFluidMaterial("papaya_juice", 0xdbae72, molten);
    public static final SimpleFluidMaterial PeachJuice = new SimpleFluidMaterial("peach_juice", 0xd29c78, molten);
    public static final SimpleFluidMaterial PearJuice = new SimpleFluidMaterial("pear_juice", 0xadbf5a, molten);
    public static final SimpleFluidMaterial PersimmonJuice = new SimpleFluidMaterial("persimmon_juice", 0xee9521, molten);
    public static final SimpleFluidMaterial PlumJuice = new SimpleFluidMaterial("plum_juice", 0xc260ca, molten);
    public static final SimpleFluidMaterial PomegranateJuice = new SimpleFluidMaterial("pomegranate_juice", 0xa03d3d, molten);
    public static final SimpleFluidMaterial RaspberryJuice = new SimpleFluidMaterial("raspberry_juice", 0xa63749, molten);
    public static final SimpleFluidMaterial StarfruitJuice = new SimpleFluidMaterial("starfruit_juice", 0xc0ed6c, molten);
    public static final SimpleFluidMaterial StrawberryJuice = new SimpleFluidMaterial("strawberry_juice", 0xc41a1a, molten);

    //yogurts
    public static final SimpleFluidMaterial AppleYogurt = new SimpleFluidMaterial("apple_yogurt", 0xe6d673, smooth);
    public static final SimpleFluidMaterial ApricotYogurt = new SimpleFluidMaterial("apricot_yogurt", 0xe3b784, smooth);
    public static final SimpleFluidMaterial BananaYogurt = new SimpleFluidMaterial("banana_yogurt", 0xedeba1, smooth);
    public static final SimpleFluidMaterial BlackberryYogurt = new SimpleFluidMaterial("blackberry_yogurt", 0x915050, smooth);
    public static final SimpleFluidMaterial BlueberryYogurt = new SimpleFluidMaterial("blueberry_yogurt", 0x5178b5, smooth);
    public static final SimpleFluidMaterial CherryYogurt = new SimpleFluidMaterial("cherry_yogurt", 0xc95a47, smooth);
    public static final SimpleFluidMaterial ChocolateYogurt = new SimpleFluidMaterial("chocolate_yogurt", 0x452b0e, smooth);
    public static final SimpleFluidMaterial CoconutYogurt = new SimpleFluidMaterial("coconut_yogurt", 0xfffed9, smooth);
    public static final SimpleFluidMaterial CranberryYogurt = new SimpleFluidMaterial("cranberry_yogurt", 0xe35b5b, smooth);
    public static final SimpleFluidMaterial FigYogurt = new SimpleFluidMaterial("fig_yogurt", 0xd8b5eb, smooth);
    public static final SimpleFluidMaterial GooseberryYogurt = new SimpleFluidMaterial("gooseberry_yogurt", 0xf2d768, smooth);
    public static final SimpleFluidMaterial GrapeYogurt = new SimpleFluidMaterial("grape_yogurt", 0xc462cc, smooth);
    public static final SimpleFluidMaterial GrapefruitYogurt = new SimpleFluidMaterial("grapefruit_yogurt", 0xf7b268, smooth);
    public static final SimpleFluidMaterial KiwiYogurt = new SimpleFluidMaterial("kiwi_yogurt", 0xc2ed82, smooth);
    public static final SimpleFluidMaterial LemonYogurt = new SimpleFluidMaterial("lemon_yogurt", 0xf7dc6d, smooth);
    public static final SimpleFluidMaterial LimeYogurt = new SimpleFluidMaterial("lime_yogurt", 0x96eb98, smooth);
    public static final SimpleFluidMaterial MangoYogurt = new SimpleFluidMaterial("mango_yogurt", 0xed9d9d, smooth);
    public static final SimpleFluidMaterial MelonYogurt = new SimpleFluidMaterial("melon_yogurt", 0xeb8175, smooth);
    public static final SimpleFluidMaterial OrangeYogurt = new SimpleFluidMaterial("orange_yogurt", 0xf5af64, smooth);
    public static final SimpleFluidMaterial PapayaYogurt = new SimpleFluidMaterial("papaya_yogurt", 0xe8c290, smooth);
    public static final SimpleFluidMaterial PeachYogurt = new SimpleFluidMaterial("peach_yogurt", 0xedbb9a, smooth);
    public static final SimpleFluidMaterial PearYogurt = new SimpleFluidMaterial("pear_yogurt", 0xcbdb81, smooth);
    public static final SimpleFluidMaterial PersimmonYogurt = new SimpleFluidMaterial("persimmon_yogurt", 0xfab050, smooth);
    public static final SimpleFluidMaterial PineappleYogurt = new SimpleFluidMaterial("pineapple_yogurt", 0xf5e398, smooth);
    public static final SimpleFluidMaterial PlainYogurt = new SimpleFluidMaterial("plain_yogurt", 0xe0dbce, smooth);
    public static final SimpleFluidMaterial PlumYogurt = new SimpleFluidMaterial("plum_yogurt", 0xe995f0, smooth);
    public static final SimpleFluidMaterial PomegranateYogurt = new SimpleFluidMaterial("pomegranate_yogurt", 0xcc6666, smooth);
    public static final SimpleFluidMaterial PumpkinYogurt = new SimpleFluidMaterial("pumpkin_yogurt", 0xedb64e, smooth);
    public static final SimpleFluidMaterial RaspberryYogurt = new SimpleFluidMaterial("raspberry_yogurt", 0xd66375, smooth);
    public static final SimpleFluidMaterial StarfruitYogurt = new SimpleFluidMaterial("starfruit_yogurt", 0xcdf08d, smooth);
    public static final SimpleFluidMaterial StrawberryYogurt = new SimpleFluidMaterial("strawberry_yogurt", 0xe05151, smooth);
    public static final SimpleFluidMaterial VanillaYogurt = new SimpleFluidMaterial("vanilla_yogurt", 0xd1d1d1, smooth);

    //smoothies
    public static final SimpleFluidMaterial AppleSmoothie = new SimpleFluidMaterial("apple_smoothie", 0xe6d673, molten);
    public static final SimpleFluidMaterial ApricotSmoothie = new SimpleFluidMaterial("apricot_smoothie", 0xe3b784, molten);
    public static final SimpleFluidMaterial BananaSmoothie = new SimpleFluidMaterial("banana_smoothie", 0xedeba1, molten);
    public static final SimpleFluidMaterial BlackberrySmoothie = new SimpleFluidMaterial("blackberry_smoothie", 0x915050, molten);
    public static final SimpleFluidMaterial BlueberrySmoothie = new SimpleFluidMaterial("blueberry_smoothie", 0x5178b5, molten);
    public static final SimpleFluidMaterial CherrySmoothie = new SimpleFluidMaterial("cherry_smoothie", 0xc95a47, molten);
    public static final SimpleFluidMaterial CoconutSmoothie = new SimpleFluidMaterial("coconut_smoothie", 0xfffed9, molten);
    public static final SimpleFluidMaterial CranberrySmoothie = new SimpleFluidMaterial("cranberry_smoothie", 0xe35b5b, molten);
    public static final SimpleFluidMaterial FigSmoothie = new SimpleFluidMaterial("fig_smoothie", 0xd8b5eb, molten);
    public static final SimpleFluidMaterial GooseberrySmoothie = new SimpleFluidMaterial("gooseberry_smoothie", 0xf2d768, molten);
    public static final SimpleFluidMaterial GrapeSmoothie = new SimpleFluidMaterial("grape_smoothie", 0xc462cc, molten);
    public static final SimpleFluidMaterial GrapefruitSmoothie = new SimpleFluidMaterial("grapefruit_smoothie", 0xf7b268, molten);
    public static final SimpleFluidMaterial KiwiSmoothie = new SimpleFluidMaterial("kiwi_smoothie", 0xc2ed82, molten);
    public static final SimpleFluidMaterial LemonSmoothie = new SimpleFluidMaterial("lemon_smoothie", 0xf7dc6d, molten);
    public static final SimpleFluidMaterial LimeSmoothie = new SimpleFluidMaterial("lime_smoothie", 0x96eb98, molten);
    public static final SimpleFluidMaterial MangoSmoothie = new SimpleFluidMaterial("mango_smoothie", 0xed9d9d, molten);
    public static final SimpleFluidMaterial MelonSmoothie = new SimpleFluidMaterial("melon_smoothie", 0xeb8175, molten);
    public static final SimpleFluidMaterial OrangeSmoothie = new SimpleFluidMaterial("orange_smoothie", 0xf5af64, molten);
    public static final SimpleFluidMaterial PapayaSmoothie = new SimpleFluidMaterial("papaya_smoothie", 0xe8c290, molten);
    public static final SimpleFluidMaterial PeachSmoothie = new SimpleFluidMaterial("peach_smoothie", 0xedbb9a, molten);
    public static final SimpleFluidMaterial PearSmoothie = new SimpleFluidMaterial("pear_smoothie", 0xcbdb81, molten);
    public static final SimpleFluidMaterial PersimmonSmoothie = new SimpleFluidMaterial("persimmon_smoothie", 0xfab050, molten);
    public static final SimpleFluidMaterial PlumSmoothie = new SimpleFluidMaterial("plum_smoothie", 0xe995f0, molten);
    public static final SimpleFluidMaterial PomegranateSmoothie = new SimpleFluidMaterial("pomegranate_smoothie", 0xcc6666, molten);
    public static final SimpleFluidMaterial RaspberrySmoothie = new SimpleFluidMaterial("raspberry_smoothie", 0xd66375, molten);
    public static final SimpleFluidMaterial StarfruitSmoothie = new SimpleFluidMaterial("starfruit_smoothie", 0xcdf08d, molten);
    public static final SimpleFluidMaterial StrawberrySmoothie = new SimpleFluidMaterial("strawberry_smoothie", 0xe05151, molten);

    //soups
    public static final SimpleFluidMaterial AsparagusSoup = new SimpleFluidMaterial("asparagus_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial BeetSoup = new SimpleFluidMaterial("beet_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial BlazingSoup = new SimpleFluidMaterial("blazing_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial CactusSoup = new SimpleFluidMaterial("cactus_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial CarrotSoup = new SimpleFluidMaterial("carrot_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial CelerySoup = new SimpleFluidMaterial("celery_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial ChickenNoodleSoup = new SimpleFluidMaterial("chicken_noodle_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial ChorusFruitSoup = new SimpleFluidMaterial("chorus_fruit_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial CreamOfAvocadoSoup = new SimpleFluidMaterial("cream_of_avocado_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial CreamedBroccoliSoup = new SimpleFluidMaterial("creamed_broccoli_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial CucumberSoup = new SimpleFluidMaterial("cucumber_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial GardenSoup = new SimpleFluidMaterial("garden_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial HotAndSourSoup = new SimpleFluidMaterial("hot_and_sour_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial LambBarleySoup = new SimpleFluidMaterial("lamb_barley_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial LeekBaconSoup = new SimpleFluidMaterial("leek_bacon_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial MisoSoup = new SimpleFluidMaterial("miso_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial MobSoup = new SimpleFluidMaterial("mob_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial OldWorldVeggieSoup = new SimpleFluidMaterial("old_world_veggie_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial OnionSoup = new SimpleFluidMaterial("onion_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial PizzaSoup = new SimpleFluidMaterial("pizza_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial PeaAndHamSoup = new SimpleFluidMaterial("pea_and_ham_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial PeanutSoup = new SimpleFluidMaterial("peanut_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial PotatoSoup = new SimpleFluidMaterial("potato_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial PotatoAndLeekSoup = new SimpleFluidMaterial("potato_and_leek_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial PumpkinSoup = new SimpleFluidMaterial("pumpkin_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial RiceSoup = new SimpleFluidMaterial("rice_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial SeedSoup = new SimpleFluidMaterial("seed_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial SpiderEyeSoup = new SimpleFluidMaterial("spider_eye_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial SplitPeaSoup = new SimpleFluidMaterial("split_pea_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial TomatoSoup = new SimpleFluidMaterial("tomato_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial TurnipSoup = new SimpleFluidMaterial("turnip_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial VegetableSoup = new SimpleFluidMaterial("vegetable_soup", 0xd9afac, smooth);
    public static final SimpleFluidMaterial WontonSoup = new SimpleFluidMaterial("wonton_soup", 0xd9afac, smooth);

    @Override
    public void onMaterialsInit() {

    }
}
