package ru.fr0le.rpg.client.render;

import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.fr0le.rpg.client.render.armor.RenderEquipArmor;
import ru.fr0le.rpg.containers.CustomSlots;
import ru.fr0le.rpg.entities.player.ExtendedPlayer;
import ru.fr0le.rpg.items.armor.ArmorType.armorTypeGloves;

public class RenderGloves {

	public RenderGloves() {

	}

	public void render(EntityPlayer player, RenderPlayer renderModel) {
		ItemStack equipStack = ExtendedPlayer.get(player).inventory.getStackInSlot(CustomSlots.GLOVES.ordinal());
		Item equip = equipStack.getItem();

		if(equip instanceof armorTypeGloves) RenderEquipArmor.renderGloves(renderModel, equip);
	}

}