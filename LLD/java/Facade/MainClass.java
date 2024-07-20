package Facade;

import java.io.File;

public class MainClass {
    public static void main(String args[]) {
        // VideoConversionFacade videoConverter = new VideoConversionFacade();
        // videoConverter.ConvertVideo("filename", "format");
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}

class VideoConversionFacade {

    public File convertVideo(String filename, String format) {
        System.out.println("VideoConversionFacade: Conversion started!");
        VideoFile file = new VideoFile(filename);
        Codec sourceCodec = CodeFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        return result;
    }
}
