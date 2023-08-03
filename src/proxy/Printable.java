package proxy;

public interface Printable {

    void setPrinterName(String name); // 이름을 설정
    String getPrinterName(); // 이름을 취득
    void print(String str); // 문자열 표시(프린트아웃)
}
