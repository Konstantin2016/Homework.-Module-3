package goit.homework.module3_1;

abstract public class File {
    private byte fileSize; //размер файла общая переменная для всех файлов
    private String nameNewFile;

    public String getExtensionNewFile() {
        return extensionNewFile;
    }

    public void setExtensionNewFile(String extensionNewFile) {
        this.extensionNewFile = extensionNewFile;
    }

    public byte getFileSize() {
        return fileSize;
    }

    public void setFileSize(byte fileSize) {
        this.fileSize = fileSize;
    }

    public String getNameNewFile() {
        return nameNewFile;
    }

    public void setNameNewFile(String nameNewFile) {
        this.nameNewFile = nameNewFile;
    }

    private String extensionNewFile;
}
