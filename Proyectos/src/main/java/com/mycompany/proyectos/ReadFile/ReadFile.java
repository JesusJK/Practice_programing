
package com.mycompany.proyectos.ReadFile;

import java.io.File;
import java.io.FileReader;

public class ReadFile {
    private File file;
    private FileReader fileReader;
    private BufferedeReader bufferedReader;

    public ReadFile(File file) {
        this.file = file;
        this.fileReader = new FileReader(file);
        this.bufferedReader = new BufferedReader(fileReader);
    }
    
    
}
