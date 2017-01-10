package uk.co.mrhappysandwich.basicmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionAttackDamage;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import uk.co.mrhappysandwich.basicmod.BasicMod;

import java.util.List;

/**
 * Created by Steven on 10/01/2017.
 */
public class ItemTutorialItem extends ItemSword {

    public ItemTutorialItem(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(BasicMod.tabMod);
    }



    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("This is adding a description to the item");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        //Changes Grass Block Into Stone
        if(worldIn.getBlockState(pos.up(2)).getBlock() == Blocks.GRASS){
            worldIn.setBlockState(pos, Blocks.STONE.getDefaultState());
            return EnumActionResult.SUCCESS;
        }

        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        if(!world.isRemote){
            player.addExperience(10);
        }
        return super.onItemRightClick(world, player, hand);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC; //Changes colour of the text
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true; //If enchanted or not
    }

}
