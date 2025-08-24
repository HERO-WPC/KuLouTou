package com.hero.klt;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class klt extends JavaPlugin {

    @Override
    public void onEnable() {
        addWitherSkeletonHeadRecipe();
        getLogger().info("klt 已启用666！");
    }

    // 处理 /nb 指令
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("nb")) {
            sender.sendMessage("you nb");
            sender.sendMessage("your mom nb");
            sender.sendMessage("your dad nb");
            sender.sendMessage("周围摆煤炭中间放石头！");
            return true;
        }
        return false;
    }

    // 添加合成表
    private void addWitherSkeletonHeadRecipe() {
        ItemStack result = new ItemStack(Material.WITHER_SKELETON_SKULL, 1);

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "wither_skull"), result);
        recipe.shape("CCC", "CSC", "CCC");
        recipe.setIngredient('C', Material.COAL);
        recipe.setIngredient('S', Material.STONE);

        getServer().addRecipe(recipe);
    }
}
