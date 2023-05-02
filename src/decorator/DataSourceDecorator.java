package decorator;

/**
 * 기초 데코레이터 클래스는 다른 컴포넌트들과 같은 인터페이스를 따른다.
 * 클래스의 주목적은 모든 구상 데코레이터에 대한 래핑 인터페이스를 정의하는것이다.
 * 래핑 코드의 디폴트 구현에는 래핑된 컴포넌트를 저장하기 위한 필드와 이를 초기화하는 수단들이 포함될 수 있다.
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    // 기초 데코레이터는 단순히 모든 작업을 래핑된 컴포넌트에 위임한다.
    // 구상 데코레이터들에는 추가 행동들이 추가될 수 있다.
    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
