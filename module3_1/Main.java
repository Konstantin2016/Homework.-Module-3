package goit.homework.module3_1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FileAudio fileAudio = new FileAudio();//создание нового объекта класса.
        fileAudio.setNameNewFile("AudioFile1");// указываем значения переменных, которые раньше были объявлены в описании класса
        fileAudio.setExtensionNewFile(".mp3");
        fileAudio.setFileSize((byte) 256);

        FileImage fileImage = new FileImage();
        fileImage.setNameNewFile("ImageFile1");
        fileImage.setExtensionNewFile(".jpg");
        fileImage.setFileSize((byte) 1024);

        FileText fileText = new FileText();
        fileText.setNameNewFile("TextFile1");
        fileText.setExtensionNewFile(".txt");
        fileText.setFileSize((byte) 2048);

        Directory dir = new Directory();// создаем новую дерикторию

             List<File> filesDirectory=new ArrayList<>();
                filesDirectory.add(fileAudio);// добавляем объекты ("аудио файл, рисунок, музыка") в директорию
                filesDirectory.add(fileImage);
                filesDirectory.add(fileText);

        dir.setFiles(filesDirectory); //добавляем (сетим) файлы в лиректорию

        System.out.print(dir.getFiles()); //вывод в консоль содержимого директории

        //List directory = new ArrayList();//указываем метод спbсок для директории
        //directory.add(fileAudio.nameFileAudio + fileAudio.extensionFileAudio + " Size:" + fileAudio.fileSize);//добавляем в директорию файлы
        //directory.add(fileImage.nameFileImage + fileImage.extensionFileImage + " Size:" + fileImage.fileSize);
        //directory.add(fileText.nameFileText + fileText.extensionFileText + " Size:" + fileText.fileSize);
       // System.out.println ("Directory list " + directory);


    }

}

