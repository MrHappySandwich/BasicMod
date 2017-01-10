package uk.co.mrhappysandwich.basicmod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.co.mrhappysandwich.basicmod.BasicMod;
import uk.co.mrhappysandwich.basicmod.tab.CreativeTabTutorial;

/**
 * Created by Steven on 10/01/2017.
 */
public class ModItems {

    public static Item tutorialItem;
    public static Throwable tutorialThrowable;

    //Make items here
    public static void preInit()
    {
        //Instead of using pre-defined material (gold, diamond) creates own values
        tutorialItem = new ItemTutorialItem(EnumHelper.addToolMaterial("TUTORIAL", 3,224, 10.0f, 10.0f, 25), "tutorial_item");

        registerItems();
    }

    public static void registerItems()
    {
        GameRegistry.register(tutorialItem, new ResourceLocation(BasicMod.MODID, "tutorial_item"));
    }

    public static void registerRenders()
    {
        registerRender(tutorialItem);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(BasicMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
