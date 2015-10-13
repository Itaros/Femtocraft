package com.itszuvalex.femtocraft.testbed.items

import com.itszuvalex.femtocraft.Femtocraft
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.item.{ItemStack, Item}
import net.minecraft.util.IIcon


/**
 * Created by Semion on 13.10.2015.
 */
class GenericItem extends Item{

  private var icon:IIcon = null

  override def registerIcons(ir:IIconRegister): Unit = {
    icon = ir.registerIcon(Femtocraft.ID+":"+this.getUnlocalizedName)
  }

  override def getIconIndex(p_77650_1_ : ItemStack): IIcon = icon

  override def getIcon(stack: ItemStack, pass: Int): IIcon = icon
}
