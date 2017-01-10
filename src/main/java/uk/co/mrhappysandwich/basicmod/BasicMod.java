package uk.co.mrhappysandwich.basicmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.mrhappysandwich.basicmod.item.ModItems;
import uk.co.mrhappysandwich.basicmod.proxy.CommonProxy;
import uk.co.mrhappysandwich.basicmod.tab.CreativeTabTutorial;

@Mod(modid = BasicMod.MODID, version = BasicMod.VERSION, name = BasicMod.NAME)
public class BasicMod
{
    public static final String MODID = "basicmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Basic Mod - Learning to mod";

    @SidedProxy(clientSide = "uk.co.mrhappysandwich.basicmod.proxy.ClientProxy", serverSide = "uk.co.mrhappysandwich.basicmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static BasicMod instance;

    public static CreativeTabTutorial tabMod;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tabMod = new CreativeTabTutorial(CreativeTabs.getNextID(), "tab_tutorial");
        ModItems.preInit();

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
