package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileEx {
    public static void main(String[] args) {
        Path path = getPath();
        tryReadLines(path);

        Path systemPath = getSystemPath();
        tryReadDirectories(systemPath);

    }

    private static void tryReadDirectories(Path systemPath) {
        try(Stream<Path> streamPath = getOneLevelDeep(systemPath)){

            getDirectories(streamPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getDirectories(Stream<Path> streamPath) {
        streamPath.filter(thisPath-> thisPath.toFile().isDirectory())
                .forEach(System.out::println);
    }

    private static Stream<Path> getOneLevelDeep(Path systemPath) throws IOException {
        return Files.walk(systemPath, 1);
    }

    private static Path getSystemPath() {
        return Paths.get("C:/");
    }

    private static void tryReadLines(Path path) {
        try(Stream<String> stream = getLines(path)){

            printLine(stream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Stream<String> getLines(Path path) throws IOException {
        return Files.lines(path);
    }

    private static void printLine(Stream<String> stream) {
        stream.forEach(System.out::println);
    }

    private static Path getPath() {
        return Paths.get("C:", "Users", "YonePC", "IdeaProjects", "lambda", "src", "Time", "DataAndTimeCompleteExample", "people.txt");
    }
}
