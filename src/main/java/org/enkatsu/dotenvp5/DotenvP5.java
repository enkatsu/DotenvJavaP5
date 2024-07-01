package org.enkatsu.dotenvp5;

import processing.core.PApplet;

import java.util.Set;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;

public class DotenvP5 {
    PApplet app;
    Dotenv dotenv;

    public DotenvP5(PApplet app) {
        this(app, app.sketchPath());
    }

    public DotenvP5(PApplet app, String path) {
        dotenv = Dotenv
            .configure()
            .directory(path)
            .load();
    }

    public Set<DotenvEntry> entries() {
        return dotenv.entries();
    }

    public String get(String key) {
        return dotenv.get(key);
    }

    public String get(String key, String defaultValue) {
        return dotenv.get(key, defaultValue);
    }

    public String toString() {
        return dotenv.entries().toString();
    }
}
