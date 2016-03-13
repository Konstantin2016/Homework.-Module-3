package goit.homework.module3_1;

import java.util.List;

public class Directory {
    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    private List<File> files; //поле типа List "список" с названием "files" с доступом тольько в рамках класса
    }