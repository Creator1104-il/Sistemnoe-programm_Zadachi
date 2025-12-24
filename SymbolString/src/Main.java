import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            //открытие файла
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\azhun\\Downloads\\24_demo.txt"));
            //чтение строки(весь докумень является одной строкой)
            String s = bufferedReader.readLine();
            System.out.println(findMaxLengthXFromPython(s));
            System.out.println(findMaxLengthX(s));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
        finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла");
                }
            }
        }
    }
    //перевод кода с Python на Java
    static int findMaxLengthXFromPython(String s){
        int count=1;
        int maxCount=0;
        char[] array = s.toCharArray();
        for (int i =0; i<array.length-1;i++){
            if (array[i]=='X'&&array[i+1]=='X'){
                count++;
                if(count>maxCount){ maxCount=count;}
            }
            else {
                count = 1;
            }
        }
        return maxCount;
    }
    //моё решение данной задачи
    static int findMaxLengthX(String s){
        int maxCount = 0;
        Pattern pattern = Pattern.compile("X+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            if((matcher.end() - matcher.start())>maxCount){
                maxCount = (matcher.end() - matcher.start());
            }
        }
        return maxCount;
    }
}