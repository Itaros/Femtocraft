package com.itszuvalex.femtocraft.testbed.items

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

/**
 * Created by Semion on 13.10.2015.
 */
object TestbedItems {

  var itemTestbedGenericNanite: Item = null
  var itemTestbedSomedevice: Item = null

  def register(tab: CreativeTabs {def getTabIconItem: Item}): Unit = {
    itemTestbedGenericNanite = itemreg("nanitecontainer_generic",tab)
    itemTestbedSomedevice = itemreg("somedevice",tab)
  }

  private def itemreg(name:String, tab:CreativeTabs):Item={
    var item = new GenericItem()
    item.setUnlocalizedName(name)
    GameRegistry.registerItem(item,name)
    item.setCreativeTab(tab)
    return item
  }

}
