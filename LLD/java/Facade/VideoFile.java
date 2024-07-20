package Facade;

public class VideoFile {
    private String name;
    private String codecType;
    VideoFile(String filename){
        // System.out.println(filename);
        this.name = filename;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }
    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}
