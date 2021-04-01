package dev.yhdiamond.wispsuperitems;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CraftingListener implements Listener {
    @EventHandler
    public void onCraft(CraftItemEvent e) {
        if (WispSuperItems.gamestarted) {
            if (e.getRecipe().getResult().getType().equals(Material.BOOK)) {
                Material type = Material.ENCHANTED_BOOK;
                ItemStack stack = new ItemStack(type);
                EnchantmentStorageMeta meta = (EnchantmentStorageMeta) stack.getItemMeta();
                Enchantment rand = Enchantment.values()[new Random().nextInt(Enchantment.values().length)];
                meta.addStoredEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().toString().contains("PICKAXE") || e.getRecipe().getResult().getType().toString().contains("HOE") || e.getRecipe().getResult().getType().toString().contains("SHOVEL") || e.getRecipe().getResult().getType().toString().contains("AXE")) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DIG_SPEED);
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.LOOT_BONUS_BLOCKS);
                randEnchants.add(Enchantment.SILK_TOUCH);
                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().toString().contains("SWORD")) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.LOOT_BONUS_MOBS);
                randEnchants.add(Enchantment.DAMAGE_ALL);
                randEnchants.add(Enchantment.DAMAGE_ARTHROPODS);
                randEnchants.add(Enchantment.DAMAGE_UNDEAD);
                randEnchants.add(Enchantment.SWEEPING_EDGE);
                randEnchants.add(Enchantment.KNOCKBACK);
                randEnchants.add(Enchantment.FIRE_ASPECT);

                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().equals(Material.BOW)) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.ARROW_DAMAGE);
                randEnchants.add(Enchantment.ARROW_FIRE);
                randEnchants.add(Enchantment.ARROW_INFINITE);
                randEnchants.add(Enchantment.ARROW_KNOCKBACK);
                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().equals(Material.CROSSBOW)) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.ARROW_DAMAGE);
                randEnchants.add(Enchantment.ARROW_FIRE);
                randEnchants.add(Enchantment.ARROW_INFINITE);
                randEnchants.add(Enchantment.ARROW_KNOCKBACK);
                randEnchants.add(Enchantment.PIERCING);
                randEnchants.add(Enchantment.QUICK_CHARGE);
                randEnchants.add(Enchantment.MULTISHOT);
                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().equals(Material.SHEARS)) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.DIG_SPEED);
                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().equals(Material.FLINT_AND_STEEL)) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().equals(Material.FISHING_ROD)) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.LURE);
                randEnchants.add(Enchantment.LUCK);
                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().equals(Material.SHIELD)) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().equals(Material.TRIDENT)) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.LOOT_BONUS_MOBS);
                randEnchants.add(Enchantment.DAMAGE_ALL);
                randEnchants.add(Enchantment.DAMAGE_ARTHROPODS);
                randEnchants.add(Enchantment.DAMAGE_UNDEAD);
                randEnchants.add(Enchantment.SWEEPING_EDGE);
                randEnchants.add(Enchantment.KNOCKBACK);
                randEnchants.add(Enchantment.CHANNELING);
                randEnchants.add(Enchantment.RIPTIDE);
                randEnchants.add(Enchantment.LOYALTY);
                randEnchants.add(Enchantment.FIRE_ASPECT);
                randEnchants.add(Enchantment.IMPALING);
                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().toString().contains("HELMET")) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.OXYGEN);
                randEnchants.add(Enchantment.WATER_WORKER);
                randEnchants.add(Enchantment.PROTECTION_FIRE);
                randEnchants.add(Enchantment.PROTECTION_PROJECTILE);
                randEnchants.add(Enchantment.PROTECTION_EXPLOSIONS);
                randEnchants.add(Enchantment.PROTECTION_ENVIRONMENTAL);
                randEnchants.add(Enchantment.THORNS);

                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().toString().contains("BOOTS")) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.FROST_WALKER);
                randEnchants.add(Enchantment.SOUL_SPEED);
                randEnchants.add(Enchantment.PROTECTION_FALL);
                randEnchants.add(Enchantment.PROTECTION_FIRE);
                randEnchants.add(Enchantment.PROTECTION_PROJECTILE);
                randEnchants.add(Enchantment.PROTECTION_EXPLOSIONS);
                randEnchants.add(Enchantment.PROTECTION_ENVIRONMENTAL);
                randEnchants.add(Enchantment.THORNS);

                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            } else if (e.getRecipe().getResult().getType().toString().contains("CHESTPLATE") || e.getRecipe().getResult().getType().toString().contains("LEGGINGS")) {
                ItemStack stack = e.getRecipe().getResult();
                ItemMeta meta = stack.getItemMeta();
                List<Enchantment> randEnchants = new ArrayList<>();
                randEnchants.add(Enchantment.DURABILITY);
                randEnchants.add(Enchantment.MENDING);
                randEnchants.add(Enchantment.PROTECTION_FIRE);
                randEnchants.add(Enchantment.PROTECTION_PROJECTILE);
                randEnchants.add(Enchantment.PROTECTION_EXPLOSIONS);
                randEnchants.add(Enchantment.PROTECTION_ENVIRONMENTAL);
                randEnchants.add(Enchantment.THORNS);

                Enchantment rand = randEnchants.get(new Random().nextInt(randEnchants.size()));
                meta.addEnchant(rand, 1000, true);
                stack.setItemMeta(meta);
                e.setCurrentItem(stack);

            }
        }
    }
}
