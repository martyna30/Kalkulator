package com.kodilla.exception.io;

import java.io.File;

public class FileReader {
    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();//odpowiedzialna za odnalezienie klas i plików
        File file = new File(classLoader.getResource("file/names.txt").getFile());

    }
}
