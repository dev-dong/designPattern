package proxy;

public class PrinterProxy implements Printable {

    private String name;
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
        System.out.println("PrinterProxy: setPrinterName()");
    }

    @Override
    public String getPrinterName() {
        System.out.println("PrinterProxy: getPrinterName()");
        return name;
    }

    @Override
    public synchronized void print(String str) {
        real();
        real.print(str);
    }

    public void real() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
