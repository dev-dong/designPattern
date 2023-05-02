package decorator;

import java.io.*;

// 구상 컴포넌트들은 작업들에 대한 디폴트 구현들을 제공한다.
public class FileDataSource implements DataSource {
    private String name;


    @Override
    public void writeData(String data) {
        // 파일에 데이터를 쓴다.
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String readData() {
        // 파일에서 데이터 읽기
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return new String(buffer);
    }
}
