package com.itszuvalex.femtocraft.testbed.items

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

/**
 * Created by Semion on 13.10.2015.
 */
object TestbedItems {

  var itemTestbedGenericNanite: Item = null

  def register(tab: CreativeTabs {def getTabIconItem: Item}): Unit = {
    itemTestbedGenericNanite = new GenericItem()
    GameRegistry.registerItem(itemTestbedGenericNanite, "nanitecontainer_generic")
    itemTestbedGenericNanite.setCreativeTab(tab)
  }

}
