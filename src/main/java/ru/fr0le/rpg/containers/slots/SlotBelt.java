package ru.fr0le.rpg.containers.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import ru.fr0le.rpg.containers.slots.SlotType.customArmorSlot;
import ru.fr0le.rpg.items.armor.ArmorType.armorTypeBelt;

public class SlotBelt extends Slot implements customArmorSlot {
	
	public SlotBelt(IInventory inventory, int slotIndex, int x, int y) {
		super(inventory, slotIndex, x, y);
	}

	public boolean isItemValid(ItemStack stack) {
		if(stack.getItem() instanceof armorTypeBelt) return true;
		else return false;
	}
	
}
