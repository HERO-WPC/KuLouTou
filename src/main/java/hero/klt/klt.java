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

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // /xiangyaole 指令给玩家一个头
        if (cmd.getName().equalsIgnoreCase("xiangyaole")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                ItemStack witherSkeletonHead = new ItemStack(Material.WITHER_SKELETON_SKULL);
                player.getInventory().addItem(witherSkeletonHead);
                player.sendMessage("666白嫖一个头");
                return true;
            } else {
                sender.sendMessage("此命令只能由玩家执行!");
                return false;
            }
        }

        // /nb 指令 夸赞
        if (cmd.getName().equalsIgnoreCase("nb")) {
            sender.sendMessage("you nb");
            sender.sendMessage("your mom nb");
            sender.sendMessage("your dad nb");
            sender.sendMessage("周围摆煤炭中间放石头！");
            return true;
        }

        return false;
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

