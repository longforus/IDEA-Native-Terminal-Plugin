package com.sburlyaev.cmd.plugin.settings;

import javax.swing.*;

public class PluginSettingsForm {

    private JTextField favoriteTerminalField;
    private JTextField subDirectoryField;
    private JPanel settingsPanel;
    private JButton terminalFileChooserButton;
    private JButton directoryFileChooserButton;

    public JPanel getSettingsPanel() {
        return settingsPanel;
    }

    public PluginSettingsState getSettingsState() {
        return new PluginSettingsState(favoriteTerminalField.getText(), subDirectoryField.getText());
    }

    public void setSettingsState(PluginSettingsState settingsState) {
        favoriteTerminalField.setText(settingsState.getFavoriteTerminal());
        subDirectoryField.setText(settingsState.getSubDirectory());
    }

    public JTextField getFavoriteTerminalField() {
        return favoriteTerminalField;
    }

    public JTextField getSubDirectoryField() {
        return subDirectoryField;
    }

    public JButton getTerminalFileChooserButton() {
        return terminalFileChooserButton;
    }

    public JButton getDirectoryFileChooserButton() {
        return directoryFileChooserButton;
    }
}
