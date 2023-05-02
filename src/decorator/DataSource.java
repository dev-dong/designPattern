package decorator;

// 컴포넌트 인터페이스는 데코레이터들이 변경할 수 있는 작업들을 정의한다.
public interface DataSource {
    void writeData(String data);

    String readData();
}
