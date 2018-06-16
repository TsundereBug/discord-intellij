package com.tsunderebug.discordintellij.discord;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import com.tsunderebug.discordintellij.PresenceActive;
import org.jetbrains.annotations.Nullable;

@State(name = "discordPresenceActive", storages = {@Storage(value = "workspace.xml")})
public class DiscordActive implements PersistentStateComponent<PresenceActive> {
    private PresenceActive presenceActive = new PresenceActive(true);

    @Nullable
    @Override
    public PresenceActive getState() {
        return this.presenceActive;
    }

    @Override
    public void loadState(PresenceActive state) {
        XmlSerializerUtil.copyBean(state, this.presenceActive);
    }

    public PresenceActive getPresenceActive() {
        return presenceActive;
    }
}