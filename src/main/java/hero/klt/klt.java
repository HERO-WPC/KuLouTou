package com.hero.klt;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class klt extends JavaPlugin {

    @Override
    public void onEnable() {
        addWitherSkeletonHeadRecipe();
        getLogger().info("klt 已启用666！");
    }

    private void addWitherSkeletonHeadRecipe() {
        ItemStack witherHead = new ItemStack(Material.WITHER_SKELETON_SKULL);

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "wither_skeleton_head"), witherHead);
        recipe.shape("SSS", "SCS", "SSS");
        recipe.setIngredient('S', Material.STONE);
        recipe.setIngredient('C', Material.COAL);

        getServer().addRecipe(recipe);
    }

    @Override
    public void onDisable() {
        getLogger().info("klt 已卸载999！");
    }
}

