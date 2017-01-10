package uk.co.mrhappysandwich.basicmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;

/**
 * Created by Steven on 10/01/2017.
 */
public class CreativeTabTutorial extends CreativeTabs {

    public CreativeTabTutorial(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.BOOK);
    }
}
