package ua.kpi.speleo.onactivityresultandroidexample.app.util;

public enum Language {

    UKRAINIAN("Ukrainian"),
    RUSSIAN("RUSSIAN"),
    ENGLISH("English");

    private String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

}
