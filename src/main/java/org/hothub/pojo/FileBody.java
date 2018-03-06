package org.hothub.pojo;

import org.hothub.utils.CommonUtils;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;

public class FileBody implements Serializable {

    private String key;
    private String fileName;
    private File file;
    private byte[] fileByte;


    public FileBody() {
    }



    public FileBody(String fileName, File file) {
        this.key = CommonUtils.getUUID();
        this.fileName = fileName;
        this.file = file;
    }

    public FileBody(String fileName, byte[] bytes) {
        this.key = CommonUtils.getUUID();
        this.fileName = fileName;
        this.fileByte = bytes;
    }



    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public byte[] getFileByte() {
        return fileByte;
    }

    public void setFileByte(byte[] fileByte) {
        this.fileByte = fileByte;
    }


    @Override
    public String toString() {
        return "FileBody{" +
                "key='" + key + '\'' +
                ", fileName='" + fileName + '\'' +
                ", file=" + file +
                ", fileByte=" + Arrays.toString(fileByte) +
                '}';
    }
}
