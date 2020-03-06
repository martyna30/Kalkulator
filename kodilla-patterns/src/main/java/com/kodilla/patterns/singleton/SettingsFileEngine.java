package com.kodilla.patterns.singleton;

public class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;//referencja do instancji klasy bedzie powołane przy probe uzycia
    private String fileName = "";

    private SettingsFileEngine() {//private zeby nikt nie mogl utworzyc obiektu klasy

    }

    public static SettingsFileEngine getInstance() {//metoda statyczna MOZNA WYWOŁAC Z KLASY BEZ TWORZENIA OBIEKTU
        if (settingsFileEngineInstance == null) {
            synchronized (SettingsFileEngine.class) {
                if (settingsFileEngineInstance == null) {
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}
