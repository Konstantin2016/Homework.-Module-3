package goit.homework.module3_1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileAudio fileAudio = new FileAudio();//создание нового объекта класса.
        fileAudio.nameFileAudio = "AudioFile1";// указываем значения переменных, которые раньше были объявлены в описании класса
        fileAudio.extensionFileAudio = ".mp3";
        fileAudio.fileSize = 1;
        //System.out.println("Name of Audio File:" + fileAudio.nameFileAudio + fileAudio.extensionFileAudio + " Size:" + fileAudio.fileSize) ;//вывод на экран названия аудиофайла

        FileImage fileImage = new FileImage();
        fileImage.nameFileImage = "ImageFile1";
        fileImage.extensionFileImage = ".jpg";
        fileImage.fileSize = 1;
       // System.out.println("Name of Image File:" + fileImage.nameFileImage + fileImage.extensionFileImage + " Size:" + fileImage.fileSize) ;//вывод на экран названия текстового файла

        FileText fileText = new FileText();
        fileText.nameFileText = "TextFile1";
        fileText.extensionFileText = ".txt";
        fileText.fileSize = 1;
      //  System.out.println("Name of Text File:" + fileText.nameFileText + fileText.extensionFileText + " Size:" + fileText.fileSize) ;//вывод на экран названия текстового файла

        Directory dir = new Directory();// создаем новую дерикторию
        List<File> filesDirectory=new ArrayList<>();
        filesDirectory.add(fileAudio);// добавляем объекты ("аудио файл, рисунок, музыка") в директорию
        filesDirectory.add(fileImage);
        filesDirectory.add(fileText);

        List directory = new ArrayList();//указываем метод спbсок для директории
        directory.add(fileAudio.nameFileAudio + fileAudio.extensionFileAudio + " Size:" + fileAudio.fileSize);//добавляем в директорию файлы
        directory.add(fileImage.nameFileImage + fileImage.extensionFileImage + " Size:" + fileImage.fileSize);
        directory.add(fileText.nameFileText + fileText.extensionFileText + " Size:" + fileText.fileSize);
        System.out.println ("Directory list " + directory);


    }

}

