package LambdaExamples;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Yone https://app.pluralsight.com/player?course=java-8-whats-new&author=jose-paumard&name=java-8-whats-new-m1&clip=4&mode=live
 */
public class FirstLambda {

    public static void main(String[] args) {

//        FileFilter filter = new FileFilter() {
//
//            @Override
//            public boolean accept(File pathname) {
//
//                return pathname.getName().endsWith(".java");
//            }
//        };

        FileFilter filterNew = (File pathname) ->
                pathname.getName().endsWith(".txt");

        File dir = new File("..");

        File[] files = dir.listFiles(filterNew);

        for (File f :
                files)

        {
            System.out.println(f);
        }
    }
}
