package lain.mods.cos.client;

import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class GuiFactoryCos implements IModGuiFactory
{

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement arg0)
    {
        return null;
    }

    @Override
    public void initialize(Minecraft arg0)
    {
    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass()
    {
        return GuiConfigCos.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }

}
