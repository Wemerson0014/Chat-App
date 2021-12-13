package com.estudo.chatapp.listeners;

import com.estudo.chatapp.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
