/**
 * A simple base converter
 * @author abagrevatil
 * 2013
 */
import com.trolltech.qt.gui.*;
import com.trolltech.qt.core.*;

public class ConvertidorBase extends QMainWindow {

    Ui_ConvertidorBase ui = new Ui_ConvertidorBase(); //User interface

    public static void main(String[] args) {
        QApplication.initialize(args);

        ConvertidorBase testConvertidorBase = new ConvertidorBase();
        testConvertidorBase.show();

        QApplication.exec();
    }
    public ConvertidorBase() {
        ui.setupUi(this);
        resize(400, 320);
        setWindowTitle("Base converter");
        setWindowIcon(new QIcon("classpath:icons/icon.png"));
        setWindowFlags(Qt.WindowType.WindowMinimizeButtonHint);//Don't maximize
        setWindowFlags(Qt.WindowType.MSWindowsFixedSizeDialogHint);//Fixed size of window
        ui.convLineEdit.setFocus();
        ui.convLineEdit.setInputMask("0000000000");//Only numbers 0-9
    }
    /**
     * Action on QLineEdit clicked
     */
    protected void on_clear_clicked(){
    	ui.convLineEdit.setText(null);
    	ui.convLineEdit.setFocus();
    	ui.convLineEdit.setCursorPosition(0);
    }
    /**
     * Binary to decimal
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String BinarioADecimal(String a) {
        int a1 = Integer.parseInt(a, 2);
        String resultado = a1 + "";
        return resultado;
    }
    /**
     * Octal to decimal
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String OctalADecimal(String a) {
        int a1 = Integer.parseInt(a, 8);
        String resultado = a1 + "";
        return resultado;
    }
    /**
     * Hexadecimal to decimal
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String HexaADecimal(String a) {
        int a1 = Integer.parseInt(a, 16);
        String resultado = a1 + "";
        return resultado;
    }
    /**
     * Decimal to binary
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String DecimalABinario(String a) {
        int x = Integer.parseInt(a);
        String resultado = Integer.toString(x, 2);
        return resultado;
    }
    /**
     * Decimal to octal
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String DecimalAOctal(String a) {
        int x = Integer.parseInt(a);
        String resultado = Integer.toString(x, 8);
        return resultado;
    }
    /**
     * Decimal to hexadecimal
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String DecimalAHexa(String a) {
        int x = Integer.parseInt(a);
        String resultado = Integer.toString(x, 16);
        return resultado;
    }
    /**
     * Binary to hexadecimal
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String BinarioAHexa(String binario) {
        Integer numero= Integer.valueOf(binario, 2);
        return Integer.toHexString(numero);
    }
    /**
     * Hexadecimal to binary
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String HexaABinario(String hexa) {
        long num= Long.valueOf(hexa, 16);
        return Long.toBinaryString(num);
    }
    /**
     * Hexadecimal to octal
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String HexaAOctal(String hexa) {
    	hexa= HexaADecimal(hexa);
    	return DecimalAOctal(hexa);
    }
    /**
     * Octal to hexadecimal
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String OctalAHexa(String hexa) {
    	hexa= OctalADecimal(hexa);
    	return DecimalAHexa(hexa);
    }
    /**
     * Octal to binary
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String OctalABinario(String hexa) {
    	hexa= OctalADecimal(hexa);
    	return DecimalABinario(hexa);
    }
    /**
     * Binary to octal
     * @param a - Text of QLineEdit
     * @return conversion
     */
    protected String BinarioAOctal(String hexa) {
    	hexa= BinarioADecimal(hexa);
    	return DecimalAOctal(hexa);
    }
    /**
     * When text changed on QLineEdit, set all values to 0 if text is empty
     * When text isn't empty execute operaciones() that convert all bases
     */
    protected void on_convLineEdit_textChanged(){
    	if(!ui.convLineEdit.text().isEmpty()){
    		operaciones();
    	}else {
    		ui.valorBinLabel.setText("0");
    		ui.valorOctLabel.setText("0");
    		ui.valorHexaLabel.setText("0");
    		ui.valorDecLabel.setText("0");
    	}
    }
    /**
     * Action on decimal radio clicked: only 0-9
     */
    protected void on_deciRadio_clicked(){
    	ui.convLineEdit.setFocus();
    	ui.convLineEdit.setText(null);
    	ui.convLineEdit.setInputMask("0000000000");
    	ui.convLineEdit.setCursorPosition(0);
    }
    /**
     * Action on hexadecimal radio clicked: only 0-f
     */
    protected void on_hexaRadio_clicked(){
    	ui.convLineEdit.setFocus();
    	ui.convLineEdit.setText(null);
    	ui.convLineEdit.setInputMask("hhhhhhhhhh");
    	ui.convLineEdit.setCursorPosition(0);
    }
    /**
     * Action on octal radio clicked
     */
    protected void on_octalRadio_clicked(){
    	ui.convLineEdit.setFocus();
    	ui.convLineEdit.setText(null);
    	ui.convLineEdit.setInputMask("0000000000");
    	ui.convLineEdit.setCursorPosition(0);
    }
    /**
     * Action on binary radio clicked: only 0-1
     */
    protected void on_binarioRadio_clicked(){
    	ui.convLineEdit.setFocus();
    	ui.convLineEdit.setText(null);
    	ui.convLineEdit.setInputMask("bbbbbbbbbb");
    	ui.convLineEdit.setCursorPosition(0);
    }
    /**
     * Convert all bases depending on that radio is checked
     */
    protected void operaciones(){
    	if(ui.deciRadio.isChecked()){
    		ui.valorBinLabel.setText(DecimalABinario(ui.convLineEdit.text()));
    		ui.valorOctLabel.setText(DecimalAOctal(ui.convLineEdit.text()));
    		ui.valorHexaLabel.setText(DecimalAHexa(ui.convLineEdit.text()));
    		ui.valorDecLabel.setText(ui.convLineEdit.text());
    	}
		else if(ui.hexaRadio.isChecked()){
    		ui.valorBinLabel.setText(HexaABinario(ui.convLineEdit.text()));
    		ui.valorOctLabel.setText(HexaAOctal(ui.convLineEdit.text()));
    		ui.valorHexaLabel.setText(ui.convLineEdit.text());
    		ui.valorDecLabel.setText(HexaADecimal(ui.convLineEdit.text()));
		}
		else if(ui.octalRadio.isChecked()){
			ui.valorBinLabel.setText(OctalABinario(ui.convLineEdit.text()));
    		ui.valorOctLabel.setText(ui.convLineEdit.text());
    		ui.valorHexaLabel.setText(OctalAHexa(ui.convLineEdit.text()));
    		ui.valorDecLabel.setText(OctalADecimal(ui.convLineEdit.text()));
		}
		else if(ui.binarioRadio.isChecked()){
			ui.valorBinLabel.setText(ui.convLineEdit.text());
    		ui.valorOctLabel.setText(BinarioAOctal(ui.convLineEdit.text()));
    		ui.valorHexaLabel.setText(BinarioAHexa(ui.convLineEdit.text()));
    		ui.valorDecLabel.setText(BinarioADecimal(ui.convLineEdit.text()));
		}
    }
}
